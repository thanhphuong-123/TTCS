package tran.tuananh.movie.Table.DTO;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoleDTOTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void RoleDTOTestAllArgs() {
        RoleDTO roleDTO = new RoleDTO(1, "1", "1", true, true, LocalDateTime.now(), LocalDateTime.now());
        MatcherAssert.assertThat(roleDTO.getId(), Matchers.notNullValue());
        MatcherAssert.assertThat(roleDTO.getName(), Matchers.notNullValue());
        MatcherAssert.assertThat(roleDTO.getDescription(), Matchers.notNullValue());
        MatcherAssert.assertThat(roleDTO.getIsActive(), Matchers.notNullValue());
        MatcherAssert.assertThat(roleDTO.getIsDelete(), Matchers.notNullValue());
        MatcherAssert.assertThat(roleDTO.getCreatedDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(roleDTO.getUpdatedDate(), Matchers.notNullValue());
    }

    @Test
    public void RoleDTOTestNoArgs() {
        RoleDTO roleDTO = new RoleDTO();
        MatcherAssert.assertThat(roleDTO.getId(), Matchers.nullValue());
        MatcherAssert.assertThat(roleDTO.getName(), Matchers.nullValue());
        MatcherAssert.assertThat(roleDTO.getDescription(), Matchers.nullValue());
        MatcherAssert.assertThat(roleDTO.getIsActive(), Matchers.nullValue());
        MatcherAssert.assertThat(roleDTO.getIsDelete(), Matchers.nullValue());
        MatcherAssert.assertThat(roleDTO.getCreatedDate(), Matchers.nullValue());
        MatcherAssert.assertThat(roleDTO.getUpdatedDate(), Matchers.nullValue());
    }

    @Test
    public void RoleDTOTestGetterSetter() {
        RoleDTO roleDTO = new RoleDTO();
        roleDTO.setId(1);
        roleDTO.setName("1");
        roleDTO.setDescription("1");
        roleDTO.setIsActive(true);
        roleDTO.setIsDelete(true);
        roleDTO.setCreatedDate(LocalDateTime.now());
        roleDTO.setUpdatedDate(LocalDateTime.now());
        MatcherAssert.assertThat(roleDTO.getId(), Matchers.notNullValue());
        MatcherAssert.assertThat(roleDTO.getName(), Matchers.notNullValue());
        MatcherAssert.assertThat(roleDTO.getDescription(), Matchers.notNullValue());
        MatcherAssert.assertThat(roleDTO.getIsActive(), Matchers.notNullValue());
        MatcherAssert.assertThat(roleDTO.getIsDelete(), Matchers.notNullValue());
        MatcherAssert.assertThat(roleDTO.getCreatedDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(roleDTO.getUpdatedDate(), Matchers.notNullValue());
    }

    @Test
    public void RoleDTOTestEqualAndHashCode() {
        RoleDTO roleDTO1 = new RoleDTO();
        RoleDTO roleDTO2 = new RoleDTO();
        assertEquals(roleDTO1.equals(roleDTO2), roleDTO2.equals(roleDTO1));
        assertEquals(roleDTO1.hashCode(), roleDTO2.hashCode());
    }
}