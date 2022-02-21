package tran.tuananh.movie.Table.Response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tran.tuananh.movie.Table.Model.User;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class SignInResponse {

    private String accessToken;
    private String refreshToken;
    private String type = "Bearer";
    private User user;
    private LocalDateTime expiredAt;

}
