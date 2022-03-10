package tran.tuananh.movie.Table.DTO;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieDTOTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void MovieDTOTestAllArgs() {
        MovieDTO dto = new MovieDTO(1, 1, "1", "1", 1.0f, LocalDateTime.now(), 1,
            "1", "1", "1", "1", 1, true, true,
            LocalDateTime.now(), LocalDateTime.now(), "1", "1", new ArrayList<>());
        MatcherAssert.assertThat(dto.getId(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getCountryId(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getTitle(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getName(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getRate(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getReleaseDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getRuntime(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getOverview(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getTrailerUrl(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getMovieUrl(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getPosterUrl(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getIsActive(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getIsDelete(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getCreatedDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getUpdatedDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getCreatedUserId(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getUpdatedUserId(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getGenres(), Matchers.notNullValue());
    }

    @Test
    public void MovieDTOTestNoArgs() {
        MovieDTO dto = new MovieDTO();
        MatcherAssert.assertThat(dto.getId(), Matchers.nullValue());
        MatcherAssert.assertThat(dto.getCountryId(), Matchers.nullValue());
        MatcherAssert.assertThat(dto.getTitle(), Matchers.nullValue());
        MatcherAssert.assertThat(dto.getName(), Matchers.nullValue());
        MatcherAssert.assertThat(dto.getRate(), Matchers.nullValue());
        MatcherAssert.assertThat(dto.getReleaseDate(), Matchers.nullValue());
        MatcherAssert.assertThat(dto.getRuntime(), Matchers.nullValue());
        MatcherAssert.assertThat(dto.getOverview(), Matchers.nullValue());
        MatcherAssert.assertThat(dto.getTrailerUrl(), Matchers.nullValue());
        MatcherAssert.assertThat(dto.getMovieUrl(), Matchers.nullValue());
        MatcherAssert.assertThat(dto.getPosterUrl(), Matchers.nullValue());
        MatcherAssert.assertThat(dto.getIsActive(), Matchers.nullValue());
        MatcherAssert.assertThat(dto.getIsDelete(), Matchers.nullValue());
        MatcherAssert.assertThat(dto.getCreatedDate(), Matchers.nullValue());
        MatcherAssert.assertThat(dto.getUpdatedDate(), Matchers.nullValue());
        MatcherAssert.assertThat(dto.getCreatedUserId(), Matchers.nullValue());
        MatcherAssert.assertThat(dto.getUpdatedUserId(), Matchers.nullValue());
        MatcherAssert.assertThat(dto.getGenres(), Matchers.nullValue());
    }

    @Test
    public void MovieDTOTestGetterSetter() {
        MovieDTO dto = new MovieDTO();
        dto.setId(1);
        dto.setCountryId(1);
        dto.setTitle("1");
        dto.setName("1");
        dto.setRate(1.0f);
        dto.setReleaseDate(LocalDateTime.now());
        dto.setRuntime(1);
        dto.setOverview("1");
        dto.setTrailerUrl("1");
        dto.setMovieUrl("1");
        dto.setPosterUrl("1");
        dto.setIsActive(true);
        dto.setIsDelete(true);
        dto.setCreatedDate(LocalDateTime.now());
        dto.setUpdatedDate(LocalDateTime.now());
        dto.setCreatedUserId("1");
        dto.setUpdatedUserId("1");
        dto.setGenres(new ArrayList<>());
        MatcherAssert.assertThat(dto.getId(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getCountryId(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getTitle(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getName(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getRate(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getReleaseDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getRuntime(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getOverview(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getTrailerUrl(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getMovieUrl(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getPosterUrl(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getIsActive(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getIsDelete(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getCreatedDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getUpdatedDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getCreatedUserId(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getUpdatedUserId(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getGenres(), Matchers.notNullValue());
    }

    @Test
    public void MovieDTOTestEqualAndHashCode() {
        MovieDTO dto1 = new MovieDTO();
        MovieDTO dto2 = new MovieDTO();
        assertEquals(dto1.equals(dto2), dto2.equals(dto1));
        assertEquals(dto1.hashCode(), dto2.hashCode());
    }
}