package tran.tuananh.movie.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import tran.tuananh.movie.Exception.RefreshTokenException;
import tran.tuananh.movie.Repository.RefreshTokenRepository;
import tran.tuananh.movie.Repository.UserRepository;
import tran.tuananh.movie.Service.RefreshTokenService;
import tran.tuananh.movie.Table.Model.RefreshToken;
import tran.tuananh.movie.Table.Model.User;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Optional;
import java.util.UUID;

@Repository
public class RefreshTokenServiceImpl implements RefreshTokenService {

    @Value("${movie.refreshTokenExpirationTime}")
    private long refreshTokenExpirationTime;

    @Autowired
    private RefreshTokenRepository refreshTokenRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public RefreshToken createRefreshToken(String userId) {
        RefreshToken refreshToken = new RefreshToken();
        Optional<User> optionalUser = userRepository.findById(userId);
        optionalUser.ifPresent(refreshToken::setUser);
        Date expiredDate = new Date((new Date()).getTime() + refreshTokenExpirationTime);
        refreshToken.setExpiredDate(expiredDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
        refreshToken.setToken(UUID.randomUUID().toString());
        refreshTokenRepository.save(refreshToken);
        return refreshToken;
    }

    @Override
    public RefreshToken verifyExpiration(RefreshToken token) {
        if (token.getExpiredDate().isBefore(LocalDateTime.now())) {
            refreshTokenRepository.delete(token);
            throw new RefreshTokenException();
        }
        return token;
    }

    @Override
    public Optional<RefreshToken> findByToken(String token) {
        return refreshTokenRepository.findByToken(token);
    }
}
