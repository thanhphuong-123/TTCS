package tran.tuananh.movie.Table.DTO;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenreDTOTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void GenreDTOTestAllArgs() {
        GenreDTO dto = new GenreDTO(1, "1", true, true, LocalDateTime.now(), LocalDateTime.now(), "1", "1");
        MatcherAssert.assertThat(dto.getId(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getName(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getIsActive(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getIsDelete(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getCreatedDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getUpdatedDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getCreatedUserId(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getUpdatedUserId(), Matchers.notNullValue());
    }

    @Test
    public void GenreDTOTestNoArgs() {
        GenreDTO dto = new GenreDTO();
        MatcherAssert.assertThat(dto.getId(), Matchers.nullValue());
        MatcherAssert.assertThat(dto.getName(), Matchers.nullValue());
        MatcherAssert.assertThat(dto.getIsActive(), Matchers.nullValue());
        MatcherAssert.assertThat(dto.getIsDelete(), Matchers.nullValue());
        MatcherAssert.assertThat(dto.getCreatedDate(), Matchers.nullValue());
        MatcherAssert.assertThat(dto.getUpdatedDate(), Matchers.nullValue());
        MatcherAssert.assertThat(dto.getCreatedUserId(), Matchers.nullValue());
        MatcherAssert.assertThat(dto.getUpdatedUserId(), Matchers.nullValue());
    }

    @Test
    public void GenreDTOTestGetterSetter() {
        GenreDTO dto = new GenreDTO();
        dto.setId(1);
        dto.setName("1");
        dto.setIsActive(true);
        dto.setIsDelete(false);
        dto.setCreatedDate(LocalDateTime.now());
        dto.setUpdatedDate(LocalDateTime.now());
        dto.setCreatedUserId("1");
        dto.setUpdatedUserId("1");
        MatcherAssert.assertThat(dto.getId(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getName(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getIsActive(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getIsDelete(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getCreatedDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getUpdatedDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getCreatedUserId(), Matchers.notNullValue());
        MatcherAssert.assertThat(dto.getUpdatedUserId(), Matchers.notNullValue());
    }

    @Test
    public void GenreDTOTestEqualAndHashCode() {
        GenreDTO dto1 = new GenreDTO();
        GenreDTO dto2 = new GenreDTO();
        assertEquals(dto1.equals(dto2), dto2.equals(dto1));
        assertEquals(dto1.hashCode(), dto2.hashCode());
    }
}