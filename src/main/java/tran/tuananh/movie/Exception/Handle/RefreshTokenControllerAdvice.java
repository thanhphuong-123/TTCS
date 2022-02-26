package tran.tuananh.movie.Exception.Handle;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import tran.tuananh.movie.Exception.RefreshTokenException;

import java.time.LocalDateTime;

@RestControllerAdvice
public class RefreshTokenControllerAdvice {

    @ExceptionHandler(value = RefreshTokenException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public ErrorMessage handleRefreshTokenException(RefreshTokenException ex, WebRequest request) {
        return new ErrorMessage(HttpStatus.FORBIDDEN.value(), LocalDateTime.now(), ex.getMessage(),
            request.getDescription(false));
    }
}
