package tran.tuananh.movie.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class RefreshTokenException extends RuntimeException {

    public RefreshTokenException() {
        super("Refresh token is expired");
    }
}
