package tran.tuananh.movie.Table.Model;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RefreshTokenTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void RefreshTokenTestAllArgs() {
        RefreshToken refreshToken = new RefreshToken(1, "1", LocalDateTime.now(), new User());
        MatcherAssert.assertThat(refreshToken.getId(), Matchers.notNullValue());
        MatcherAssert.assertThat(refreshToken.getToken(), Matchers.notNullValue());
        MatcherAssert.assertThat(refreshToken.getExpiredDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(refreshToken.getUser(), Matchers.notNullValue());
    }

    @Test
    public void RefreshTokenTestNoArgs() {
        RefreshToken refreshToken = new RefreshToken();
        MatcherAssert.assertThat(refreshToken.getId(), Matchers.notNullValue());
        MatcherAssert.assertThat(refreshToken.getToken(), Matchers.nullValue());
        MatcherAssert.assertThat(refreshToken.getExpiredDate(), Matchers.nullValue());
        MatcherAssert.assertThat(refreshToken.getUser(), Matchers.nullValue());
    }

    @Test
    public void RefreshTokenTestGetterSetter() {
        RefreshToken refreshToken = new RefreshToken();
        refreshToken.setId(1);
        refreshToken.setToken("1");
        refreshToken.setExpiredDate(LocalDateTime.now());
        refreshToken.setUser(new User());
        MatcherAssert.assertThat(refreshToken.getId(), Matchers.notNullValue());
        MatcherAssert.assertThat(refreshToken.getToken(), Matchers.notNullValue());
        MatcherAssert.assertThat(refreshToken.getExpiredDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(refreshToken.getUser(), Matchers.notNullValue());
    }

    @Test
    public void RefreshTokenTestEqualAndHashCode() {
        RefreshToken refreshToken1 = new RefreshToken();
        RefreshToken refreshToken2 = new RefreshToken();
        assertEquals(refreshToken1.equals(refreshToken2), refreshToken2.equals(refreshToken1));
        assertEquals(refreshToken1.hashCode(), refreshToken2.hashCode());
    }
}