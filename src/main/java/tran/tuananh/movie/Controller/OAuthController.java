package tran.tuananh.movie.Controller;

import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tran.tuananh.movie.Service.OAuthService;
import tran.tuananh.movie.Table.DTO.OAuthTokenDTO;
import tran.tuananh.movie.Table.Response.GenerateResponse;
import tran.tuananh.movie.Table.Response.Response;
import tran.tuananh.movie.Table.Response.StatusCode;

import java.util.Collections;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "api/v1/oauth")
public class OAuthController {

    @Autowired
    private OAuthService oAuthService;

    @PostMapping(value = "/google")
    public Response signInWithGoogle(@RequestBody OAuthTokenDTO dto) {
        return oAuthService.signInWithGoolge(dto);
    }

    @PostMapping(value = "/facebook")
    public Response signInWithFacebook(@RequestBody OAuthTokenDTO dto) {
        return oAuthService.signInWithFacebook(dto);
    }
}
