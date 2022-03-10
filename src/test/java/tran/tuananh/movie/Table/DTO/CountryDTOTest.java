package tran.tuananh.movie.Table.DTO;


import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountryDTOTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void CountryDTOTestAllArgs() {
        CountryDTO dto = new CountryDTO("1", "1", true, true, LocalDateTime.now(), LocalDateTime.now(), "1", "1");
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
    public void CountryDTOTestNoArgs() {
        CountryDTO dto = new CountryDTO();
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
    public void CountryDTOTestGetterSetter() {
        CountryDTO dto = new CountryDTO();
        dto.setId("1");
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
    public void CountryDTOTestEqualAndHashCode() {
        CountryDTO dto1 = new CountryDTO();
        CountryDTO dto2 = new CountryDTO();
        assertEquals(dto1.equals(dto2), dto2.equals(dto1));
        assertEquals(dto1.hashCode(), dto2.hashCode());
    }
}