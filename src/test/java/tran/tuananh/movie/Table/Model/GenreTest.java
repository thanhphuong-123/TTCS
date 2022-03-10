package tran.tuananh.movie.Table.Model;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenreTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void GenreTestAllArgs() {
        Genre genre =
            new Genre(1, "1", true, true, LocalDateTime.now(), LocalDateTime.now(), "1", "1", new ArrayList<>());
        MatcherAssert.assertThat(genre.getId(), Matchers.notNullValue());
        MatcherAssert.assertThat(genre.getName(), Matchers.notNullValue());
        MatcherAssert.assertThat(genre.getIsActive(), Matchers.notNullValue());
        MatcherAssert.assertThat(genre.getIsDelete(), Matchers.notNullValue());
        MatcherAssert.assertThat(genre.getCreatedDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(genre.getUpdatedDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(genre.getCreatedUserId(), Matchers.notNullValue());
        MatcherAssert.assertThat(genre.getUpdatedUserId(), Matchers.notNullValue());
    }

    @Test
    public void GenreTestNoArgs() {
        Genre genre = new Genre();
        MatcherAssert.assertThat(genre.getId(), Matchers.nullValue());
        MatcherAssert.assertThat(genre.getName(), Matchers.nullValue());
        MatcherAssert.assertThat(genre.getIsActive(), Matchers.nullValue());
        MatcherAssert.assertThat(genre.getIsDelete(), Matchers.nullValue());
        MatcherAssert.assertThat(genre.getCreatedDate(), Matchers.nullValue());
        MatcherAssert.assertThat(genre.getUpdatedDate(), Matchers.nullValue());
        MatcherAssert.assertThat(genre.getCreatedUserId(), Matchers.nullValue());
        MatcherAssert.assertThat(genre.getUpdatedUserId(), Matchers.nullValue());
    }

    @Test
    public void GenreTestGetterSetter() {
        Genre genre = new Genre();
        genre.setId(1);
        genre.setName("1");
        genre.setIsActive(true);
        genre.setIsDelete(false);
        genre.setCreatedDate(LocalDateTime.now());
        genre.setUpdatedDate(LocalDateTime.now());
        genre.setCreatedUserId("1");
        genre.setUpdatedUserId("1");
        MatcherAssert.assertThat(genre.getId(), Matchers.notNullValue());
        MatcherAssert.assertThat(genre.getName(), Matchers.notNullValue());
        MatcherAssert.assertThat(genre.getIsActive(), Matchers.notNullValue());
        MatcherAssert.assertThat(genre.getIsDelete(), Matchers.notNullValue());
        MatcherAssert.assertThat(genre.getCreatedDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(genre.getUpdatedDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(genre.getCreatedUserId(), Matchers.notNullValue());
        MatcherAssert.assertThat(genre.getUpdatedUserId(), Matchers.notNullValue());
    }

    @Test
    public void GenreTestEqualAndHashCode() {
        Genre genre1 = new Genre();
        Genre genre2 = new Genre();
        assertEquals(genre1.equals(genre2), genre2.equals(genre1));
        assertEquals(genre1.hashCode(), genre2.hashCode());
    }
}