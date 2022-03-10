package tran.tuananh.movie.Table.DTO;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OAuthTokenDTOTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void OAuthTokenDTOTestAllArgs() {
        OAuthTokenDTO oAuthTokenDTO = new OAuthTokenDTO("1");
        MatcherAssert.assertThat(oAuthTokenDTO.getToken(), Matchers.notNullValue());
    }

    @Test
    public void OAuthTokenDTOTestNoArgs() {
        OAuthTokenDTO oAuthTokenDTO = new OAuthTokenDTO();
        MatcherAssert.assertThat(oAuthTokenDTO.getToken(), Matchers.nullValue());
    }

    @Test
    public void OAuthTokenDTOTestGetterSetter() {
        OAuthTokenDTO oAuthTokenDTO = new OAuthTokenDTO();
        oAuthTokenDTO.setToken("1");
        MatcherAssert.assertThat(oAuthTokenDTO.getToken(), Matchers.notNullValue());
    }

    @Test
    public void OAuthTokenDTOTestEqualAndHashCode() {
        OAuthTokenDTO oAuthTokenDTO1 = new OAuthTokenDTO();
        OAuthTokenDTO oAuthTokenDTO2 = new OAuthTokenDTO();
        assertEquals(oAuthTokenDTO1.equals(oAuthTokenDTO2), oAuthTokenDTO2.equals(oAuthTokenDTO1));
        assertEquals(oAuthTokenDTO1.hashCode(), oAuthTokenDTO2.hashCode());
    }

}