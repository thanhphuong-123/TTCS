package tran.tuananh.movie.Table.Model;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class RoleTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void RoleTestAllArgs() {
        Role role = new Role(1, "1", "1", true, true, LocalDateTime.now(), LocalDateTime.now());
        MatcherAssert.assertThat(role.getId(), Matchers.notNullValue());
        MatcherAssert.assertThat(role.getName(), Matchers.notNullValue());
        MatcherAssert.assertThat(role.getDescription(), Matchers.notNullValue());
        MatcherAssert.assertThat(role.getIsActive(), Matchers.notNullValue());
        MatcherAssert.assertThat(role.getIsDelete(), Matchers.notNullValue());
        MatcherAssert.assertThat(role.getCreatedDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(role.getUpdatedDate(), Matchers.notNullValue());
    }

    @Test
    public void RoleTestNoArgs() {
        Role role = new Role();
        MatcherAssert.assertThat(role.getId(), Matchers.nullValue());
        MatcherAssert.assertThat(role.getName(), Matchers.nullValue());
        MatcherAssert.assertThat(role.getDescription(), Matchers.nullValue());
        MatcherAssert.assertThat(role.getIsActive(), Matchers.nullValue());
        MatcherAssert.assertThat(role.getIsDelete(), Matchers.nullValue());
        MatcherAssert.assertThat(role.getCreatedDate(), Matchers.nullValue());
        MatcherAssert.assertThat(role.getUpdatedDate(), Matchers.nullValue());
    }

    @Test
    public void RoleTestGetterSetter() {
        Role role = new Role();
        role.setId(1);
        role.setName("1");
        role.setDescription("1");
        role.setIsActive(true);
        role.setIsDelete(true);
        role.setCreatedDate(LocalDateTime.now());
        role.setUpdatedDate(LocalDateTime.now());
        MatcherAssert.assertThat(role.getId(), Matchers.notNullValue());
        MatcherAssert.assertThat(role.getName(), Matchers.notNullValue());
        MatcherAssert.assertThat(role.getDescription(), Matchers.notNullValue());
        MatcherAssert.assertThat(role.getIsActive(), Matchers.notNullValue());
        MatcherAssert.assertThat(role.getIsDelete(), Matchers.notNullValue());
        MatcherAssert.assertThat(role.getCreatedDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(role.getUpdatedDate(), Matchers.notNullValue());
    }

    @Test
    public void RoleTestEqualAndHashCode() {
        Role role1 = new Role();
        Role role2 = new Role();
        assertEquals(role1.equals(role2), role2.equals(role1));
        assertEquals(role1.hashCode(), role2.hashCode());
    }
}