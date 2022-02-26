package tran.tuananh.movie.Service.Impl;

import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.User;
import org.springframework.social.facebook.api.impl.FacebookTemplate;
import org.springframework.stereotype.Service;
import tran.tuananh.movie.Repository.RoleRepository;
import tran.tuananh.movie.Repository.UserRepository;
import tran.tuananh.movie.Service.OAuthService;
import tran.tuananh.movie.Table.DTO.OAuthTokenDTO;
import tran.tuananh.movie.Table.Model.Role;
import tran.tuananh.movie.Table.Response.GenerateResponse;
import tran.tuananh.movie.Table.Response.Response;
import tran.tuananh.movie.Table.Response.SignInResponse;
import tran.tuananh.movie.Table.Response.StatusCode;
import tran.tuananh.movie.Util.JwtUtil;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Service
public class OAuthServiceImpl implements OAuthService {

    Logger logger = LogManager.getLogger(OAuthServiceImpl.class);

    @Autowired
    private Environment env;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtUtil jwtUtil;

    @Override
    public Response signInWithGoolge(OAuthTokenDTO dto) {
        SignInResponse response = new SignInResponse();
        String googleClientId = env.getProperty("google.client-id");
        NetHttpTransport netHttpTransport = new NetHttpTransport();
        JacksonFactory jacksonFactory = JacksonFactory.getDefaultInstance();
        try {
            GoogleIdTokenVerifier.Builder builder =
                    new GoogleIdTokenVerifier.Builder(netHttpTransport, jacksonFactory).setAudience(
                            Collections.singletonList(googleClientId));
            GoogleIdToken token = GoogleIdToken.parse(builder.getJsonFactory(), dto.getToken());
            GoogleIdToken.Payload payload = token.getPayload();

            tran.tuananh.movie.Table.Model.User user = new tran.tuananh.movie.Table.Model.User();
            if(userRepository.existsByEmail(payload.getEmail())) {
                user = userRepository.findByEmail(payload.getEmail());
            } else {
                user = saveUser((String) payload.get("name"), payload.getEmail());
            }
            OAuthTokenDTO oAuthTokenDTO = signIn(user);

            response.setAccessToken(oAuthTokenDTO.getToken());
            response.setUser(user);
            response.setExpiredAt(jwtUtil.extractExpirationTime(oAuthTokenDTO.getToken()));
            return GenerateResponse.generateSuccessResponse("SIGN IN WITH GOOGLE SUCCESS", StatusCode.SUCCESS, response);
        } catch (Exception e) {
            logger.error(e);
            return GenerateResponse.generateErrorResponse("SIGN IN WITH GOOGLE FAIL", StatusCode.ERROR);
        }
    }

    @Override
    public Response signInWithFacebook(OAuthTokenDTO dto) {
        SignInResponse response = new SignInResponse();
        Facebook facebook = new FacebookTemplate(dto.getToken());

        String[] includes = {"email", "name"};

        User userFB = facebook.fetchObject("me", User.class, includes);
        tran.tuananh.movie.Table.Model.User user = new tran.tuananh.movie.Table.Model.User();
        if(userRepository.existsByEmail(userFB.getEmail())) {
            user = userRepository.findByEmail(userFB.getEmail());
        } else {
            user = saveUser(userFB.getName(), userFB.getEmail());
        }
        OAuthTokenDTO oAuthTokenDTO = signIn(user);

        response.setAccessToken(oAuthTokenDTO.getToken());
        response.setUser(user);
        response.setExpiredAt(jwtUtil.extractExpirationTime(oAuthTokenDTO.getToken()));
        return GenerateResponse.generateSuccessResponse("SIGN IN WITH FACEBOOK SUCCESS", StatusCode.SUCCESS, response);
    }

    private OAuthTokenDTO signIn(tran.tuananh.movie.Table.Model.User user) {
        OAuthTokenDTO oAuthTokenDTO = new OAuthTokenDTO();
        String secretPsw = env.getProperty("secretPsw");

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(user.getUsername(), secretPsw));
        SecurityContextHolder.getContext().setAuthentication(authentication);

        String token = jwtUtil.generateToken(authentication);
        oAuthTokenDTO.setToken(token);
        return oAuthTokenDTO;
    }

    private tran.tuananh.movie.Table.Model.User saveUser(String username, String email) {
        LocalDateTime currentTime = LocalDateTime.now();
        tran.tuananh.movie.Table.Model.User user = new tran.tuananh.movie.Table.Model.User();
        String secretPsw = env.getProperty("secretPsw");
        Set<Role> roles = new HashSet<>();
        roles.add(roleRepository.findByName("ROLE_USER"));

        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(secretPsw));
        user.setEmail(email);
        user.setRoles(roles);
        user.setCreatedDate(currentTime);
        return userRepository.save(user);
    }
}
