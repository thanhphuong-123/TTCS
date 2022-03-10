package tran.tuananh.movie.Table.Model;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VerifyTokenTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void VerifyTokenTestAllArgs() {
        VerifyToken refreshToken = new VerifyToken("1", LocalDateTime.now(), new User());
        MatcherAssert.assertThat(refreshToken.getVerifyToken(), Matchers.notNullValue());
        MatcherAssert.assertThat(refreshToken.getExpiredDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(refreshToken.getUser(), Matchers.notNullValue());
    }

    @Test
    public void VerifyTokenTestNoArgs() {
        VerifyToken refreshToken = new VerifyToken();
        MatcherAssert.assertThat(refreshToken.getVerifyToken(), Matchers.nullValue());
        MatcherAssert.assertThat(refreshToken.getExpiredDate(), Matchers.nullValue());
        MatcherAssert.assertThat(refreshToken.getUser(), Matchers.nullValue());
    }

    @Test
    public void VerifyTokenTestGetterSetter() {
        VerifyToken refreshToken = new VerifyToken();
        refreshToken.setVerifyToken("1");
        refreshToken.setExpiredDate(LocalDateTime.now());
        refreshToken.setUser(new User());
        MatcherAssert.assertThat(refreshToken.getVerifyToken(), Matchers.notNullValue());
        MatcherAssert.assertThat(refreshToken.getExpiredDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(refreshToken.getUser(), Matchers.notNullValue());
    }

    @Test
    public void VerifyTokenTestEqualAndHashCode() {
        VerifyToken refreshToken1 = new VerifyToken();
        VerifyToken refreshToken2 = new VerifyToken();
        assertEquals(refreshToken1.equals(refreshToken2), refreshToken2.equals(refreshToken1));
        assertEquals(refreshToken1.hashCode(), refreshToken2.hashCode());
    }
}