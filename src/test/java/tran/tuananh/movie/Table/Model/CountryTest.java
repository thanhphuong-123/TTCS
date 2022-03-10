package tran.tuananh.movie.Table.Model;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountryTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void CountryTestAllArgs() {
        Country country = new Country("1", "1", true, true, LocalDateTime.now(), LocalDateTime.now(), "1", "1");
        MatcherAssert.assertThat(country.getId(), Matchers.notNullValue());
        MatcherAssert.assertThat(country.getName(), Matchers.notNullValue());
        MatcherAssert.assertThat(country.getIsActive(), Matchers.notNullValue());
        MatcherAssert.assertThat(country.getIsDelete(), Matchers.notNullValue());
        MatcherAssert.assertThat(country.getCreatedDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(country.getUpdatedDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(country.getCreatedUserId(), Matchers.notNullValue());
        MatcherAssert.assertThat(country.getUpdatedUserId(), Matchers.notNullValue());
    }

    @Test
    public void CountryTestNoArgs() {
        Country country = new Country();
        MatcherAssert.assertThat(country.getId(), Matchers.nullValue());
        MatcherAssert.assertThat(country.getName(), Matchers.nullValue());
        MatcherAssert.assertThat(country.getIsActive(), Matchers.nullValue());
        MatcherAssert.assertThat(country.getIsDelete(), Matchers.nullValue());
        MatcherAssert.assertThat(country.getCreatedDate(), Matchers.nullValue());
        MatcherAssert.assertThat(country.getUpdatedDate(), Matchers.nullValue());
        MatcherAssert.assertThat(country.getCreatedUserId(), Matchers.nullValue());
        MatcherAssert.assertThat(country.getUpdatedUserId(), Matchers.nullValue());
    }

    @Test
    public void CountryTestGetterSetter() {
        Country country = new Country();
        country.setId("1");
        country.setName("1");
        country.setIsActive(true);
        country.setIsDelete(false);
        country.setCreatedDate(LocalDateTime.now());
        country.setUpdatedDate(LocalDateTime.now());
        country.setCreatedUserId("1");
        country.setUpdatedUserId("1");
        MatcherAssert.assertThat(country.getId(), Matchers.notNullValue());
        MatcherAssert.assertThat(country.getName(), Matchers.notNullValue());
        MatcherAssert.assertThat(country.getIsActive(), Matchers.notNullValue());
        MatcherAssert.assertThat(country.getIsDelete(), Matchers.notNullValue());
        MatcherAssert.assertThat(country.getCreatedDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(country.getUpdatedDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(country.getCreatedUserId(), Matchers.notNullValue());
        MatcherAssert.assertThat(country.getUpdatedUserId(), Matchers.notNullValue());
    }

    @Test
    public void CountryTestEqualAndHashCode() {
        Country country1 = new Country();
        Country country2 = new Country();
        assertEquals(country1.equals(country2), country2.equals(country1));
        assertEquals(country1.hashCode(), country2.hashCode());
    }
}