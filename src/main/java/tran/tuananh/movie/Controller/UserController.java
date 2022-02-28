package tran.tuananh.movie.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import tran.tuananh.movie.Repository.UserRepository;
import tran.tuananh.movie.Service.UserService;
import tran.tuananh.movie.Table.DTO.UserDTO;
import tran.tuananh.movie.Table.Model.RefreshToken;
import tran.tuananh.movie.Table.Model.User;
import tran.tuananh.movie.Table.Response.Response;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public String allAccess() {
        return "Public Content.";
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public String userAccess() {
        return "User Content.";
    }

    @GetMapping("/mod")
    @PreAuthorize("hasRole('MODERATOR') or hasRole('ADMIN')")
    public String moderatorAccess() {
        return "Moderator Board.";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminAccess() {
        return "Admin Board.";
    }

    @PostMapping("/sign-in")
    public Response signIn(@RequestBody UserDTO dto) {
        return userService.signIn(dto);
    }

    @PostMapping("/sign-up")
    public Response signUp(@RequestBody UserDTO dto) {
        return userService.signUp(dto);
    }

    @PostMapping("/refresh-token")
    public Response refreshToken(@RequestBody RefreshToken refreshToken) {
        return userService.refreshToken(refreshToken);
    }

    @GetMapping("/exist-username/{username}")
    public Response existsByUsername(@PathVariable(value = "username") String username) {
        return userService.existsByUsername(username);
    }

    @GetMapping("/exist-email/{email}")
    public Response existsByEmail(@PathVariable(value = "email") String email) {
        return userService.existsByEmail(email);
    }

}
