package tran.tuananh.movie.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tran.tuananh.movie.Repository.UserRepository;
import tran.tuananh.movie.Repository.VerifyTokenRepository;
import tran.tuananh.movie.Service.VerifyTokenService;
import tran.tuananh.movie.Table.DTO.UserDTO;
import tran.tuananh.movie.Table.Model.User;
import tran.tuananh.movie.Table.Model.VerifyToken;
import tran.tuananh.movie.Table.Response.GenerateResponse;
import tran.tuananh.movie.Table.Response.Response;
import tran.tuananh.movie.Table.Response.StatusCode;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Random;

@Service
public class VerifyTokenServiceImpl implements VerifyTokenService {

    @Autowired
    private VerifyTokenRepository verifyTokenRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public VerifyToken createVerifyToken(User user) {
        Random random = new Random();
        VerifyToken verifyToken =
            new VerifyToken(String.valueOf(100000 + random.nextInt(900000)), LocalDateTime.now().plusMinutes(5), user);
        verifyTokenRepository.save(verifyToken);
        return verifyToken;
    }

    @Override
    public Response verifyToken(UserDTO dto) {
        VerifyToken verifyToken = verifyTokenRepository.findByUserId(dto.getId());
        if (verifyToken.getExpiredDate().isBefore(LocalDateTime.now())) {
            verifyTokenRepository.delete(verifyToken);
            return GenerateResponse.generateErrorResponse("VERIFY TOKEN IS EXPIRED", StatusCode.ERROR);
        }
        if (dto.getId().equals(verifyToken.getUser().getId()) &&
            verifyToken.getVerifyToken().equals(dto.getVerifyToken())) {
            Optional<User> optionalUser = userRepository.findById(dto.getId());
            if (optionalUser.isPresent()) {
                User user = optionalUser.get();
                user.setIsEnable(true);
                userRepository.save(user);
                return GenerateResponse.generateSuccessResponse("VERIFY ACCOUNT SUCCESSFULLY", StatusCode.SUCCESS, user);
            } else {
                return GenerateResponse.generateErrorResponse("CANNOT FIND USER WITH ID: " + dto.getId(),
                    StatusCode.ERROR);
            }
        }
        return GenerateResponse.generateErrorResponse("INVALID VERIFY TOKEN", StatusCode.ERROR);
    }
}
