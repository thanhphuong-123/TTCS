package tran.tuananh.movie.Table.Model;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void MovieTestAllArgs() {
        Movie movie = new Movie(1, 1, "1", "1", 1.0f, LocalDateTime.now(), 1,
            "1", "1", "1", "1", 1, true, true,
            LocalDateTime.now(), LocalDateTime.now(), "1", "1", new ArrayList<>());
        MatcherAssert.assertThat(movie.getId(), Matchers.notNullValue());
        MatcherAssert.assertThat(movie.getCountryId(), Matchers.notNullValue());
        MatcherAssert.assertThat(movie.getTitle(), Matchers.notNullValue());
        MatcherAssert.assertThat(movie.getName(), Matchers.notNullValue());
        MatcherAssert.assertThat(movie.getRate(), Matchers.notNullValue());
        MatcherAssert.assertThat(movie.getReleaseDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(movie.getRuntime(), Matchers.notNullValue());
        MatcherAssert.assertThat(movie.getOverview(), Matchers.notNullValue());
        MatcherAssert.assertThat(movie.getTrailerUrl(), Matchers.notNullValue());
        MatcherAssert.assertThat(movie.getMovieUrl(), Matchers.notNullValue());
        MatcherAssert.assertThat(movie.getPosterUrl(), Matchers.notNullValue());
        MatcherAssert.assertThat(movie.getIsActive(), Matchers.notNullValue());
        MatcherAssert.assertThat(movie.getIsDelete(), Matchers.notNullValue());
        MatcherAssert.assertThat(movie.getCreatedDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(movie.getUpdatedDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(movie.getCreatedUserId(), Matchers.notNullValue());
        MatcherAssert.assertThat(movie.getUpdatedUserId(), Matchers.notNullValue());
        MatcherAssert.assertThat(movie.getGenres(), Matchers.notNullValue());
    }

    @Test
    public void MovieTestNoArgs() {
        Movie movie = new Movie();
        MatcherAssert.assertThat(movie.getId(), Matchers.nullValue());
        MatcherAssert.assertThat(movie.getCountryId(), Matchers.nullValue());
        MatcherAssert.assertThat(movie.getTitle(), Matchers.nullValue());
        MatcherAssert.assertThat(movie.getName(), Matchers.nullValue());
        MatcherAssert.assertThat(movie.getRate(), Matchers.nullValue());
        MatcherAssert.assertThat(movie.getReleaseDate(), Matchers.nullValue());
        MatcherAssert.assertThat(movie.getRuntime(), Matchers.nullValue());
        MatcherAssert.assertThat(movie.getOverview(), Matchers.nullValue());
        MatcherAssert.assertThat(movie.getTrailerUrl(), Matchers.nullValue());
        MatcherAssert.assertThat(movie.getMovieUrl(), Matchers.nullValue());
        MatcherAssert.assertThat(movie.getPosterUrl(), Matchers.nullValue());
        MatcherAssert.assertThat(movie.getIsActive(), Matchers.nullValue());
        MatcherAssert.assertThat(movie.getIsDelete(), Matchers.nullValue());
        MatcherAssert.assertThat(movie.getCreatedDate(), Matchers.nullValue());
        MatcherAssert.assertThat(movie.getUpdatedDate(), Matchers.nullValue());
        MatcherAssert.assertThat(movie.getCreatedUserId(), Matchers.nullValue());
        MatcherAssert.assertThat(movie.getUpdatedUserId(), Matchers.nullValue());
        MatcherAssert.assertThat(movie.getGenres(), Matchers.nullValue());
    }

    @Test
    public void MovieTestGetterSetter() {
        Movie movie = new Movie();
        movie.setId(1);
        movie.setCountryId(1);
        movie.setTitle("1");
        movie.setName("1");
        movie.setRate(1.0f);
        movie.setReleaseDate(LocalDateTime.now());
        movie.setRuntime(1);
        movie.setOverview("1");
        movie.setTrailerUrl("1");
        movie.setMovieUrl("1");
        movie.setPosterUrl("1");
        movie.setIsActive(true);
        movie.setIsDelete(true);
        movie.setCreatedDate(LocalDateTime.now());
        movie.setUpdatedDate(LocalDateTime.now());
        movie.setCreatedUserId("1");
        movie.setUpdatedUserId("1");
        movie.setGenres(new ArrayList<>());
        MatcherAssert.assertThat(movie.getId(), Matchers.notNullValue());
        MatcherAssert.assertThat(movie.getCountryId(), Matchers.notNullValue());
        MatcherAssert.assertThat(movie.getTitle(), Matchers.notNullValue());
        MatcherAssert.assertThat(movie.getName(), Matchers.notNullValue());
        MatcherAssert.assertThat(movie.getRate(), Matchers.notNullValue());
        MatcherAssert.assertThat(movie.getReleaseDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(movie.getRuntime(), Matchers.notNullValue());
        MatcherAssert.assertThat(movie.getOverview(), Matchers.notNullValue());
        MatcherAssert.assertThat(movie.getTrailerUrl(), Matchers.notNullValue());
        MatcherAssert.assertThat(movie.getMovieUrl(), Matchers.notNullValue());
        MatcherAssert.assertThat(movie.getPosterUrl(), Matchers.notNullValue());
        MatcherAssert.assertThat(movie.getIsActive(), Matchers.notNullValue());
        MatcherAssert.assertThat(movie.getIsDelete(), Matchers.notNullValue());
        MatcherAssert.assertThat(movie.getCreatedDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(movie.getUpdatedDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(movie.getCreatedUserId(), Matchers.notNullValue());
        MatcherAssert.assertThat(movie.getUpdatedUserId(), Matchers.notNullValue());
        MatcherAssert.assertThat(movie.getGenres(), Matchers.notNullValue());
    }

    @Test
    public void MovieTestEqualAndHashCode() {
        Movie movie1 = new Movie();
        Movie movie2 = new Movie();
        assertEquals(movie1.equals(movie2), movie2.equals(movie1));
        assertEquals(movie1.hashCode(), movie2.hashCode());
    }
}