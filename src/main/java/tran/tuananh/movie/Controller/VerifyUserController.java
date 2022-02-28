package tran.tuananh.movie.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;
import tran.tuananh.movie.Repository.UserRepository;
import tran.tuananh.movie.Service.VerifyTokenService;
import tran.tuananh.movie.Table.DTO.UserDTO;
import tran.tuananh.movie.Table.Model.User;
import tran.tuananh.movie.Table.Model.VerifyToken;
import tran.tuananh.movie.Table.Response.Response;
import tran.tuananh.movie.Table.Response.VerifyResponse;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "api/v1/verify")
public class VerifyUserController {

    @Autowired
    private VerifyTokenService verifyTokenService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @PostMapping
    public Response verify(@RequestBody UserDTO dto) {
        return verifyTokenService.verifyToken(dto);
    }

    @PostMapping(value = "/send-token")
    public VerifyToken sendVerifyToken(@RequestBody UserDTO dto) {
        User user = userRepository.findByEmail(dto.getEmail());
        VerifyToken verifyToken = verifyTokenService.createVerifyToken(user);
        VerifyResponse verifyResponse =
            new VerifyResponse(user.getUsername(), user.getEmail(), verifyToken.getVerifyToken(),
                verifyToken.getExpiredDate());
        kafkaTemplate.send("movie.verify_user", verifyResponse);
//        emailService.sendEmail(user.getEmail(), user.getUsername(), verifyToken.getVerifyToken());
        return verifyToken;
    }
}
