package tran.tuananh.movie.Service;

import tran.tuananh.movie.Exception.RefreshTokenException;
import tran.tuananh.movie.Table.Model.RefreshToken;

import java.util.Optional;

public interface RefreshTokenService {

    RefreshToken createRefreshToken(String userId);

    RefreshToken verifyExpiration(RefreshToken token) throws RefreshTokenException;

    Optional<RefreshToken> findByToken(String token);
}
