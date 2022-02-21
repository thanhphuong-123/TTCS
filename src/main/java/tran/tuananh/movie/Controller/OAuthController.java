package tran.tuananh.movie.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tran.tuananh.movie.Service.OAuthService;
import tran.tuananh.movie.Table.DTO.OAuthTokenDTO;
import tran.tuananh.movie.Table.Response.Response;

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
