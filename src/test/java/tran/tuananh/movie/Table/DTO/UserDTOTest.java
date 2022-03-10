package tran.tuananh.movie.Table.DTO;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tran.tuananh.movie.Table.Model.Role;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserDTOTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void UserDTOTestAllArgs() {
        UserDTO userDTO =
            new UserDTO("1", "1", "1", "1", LocalDateTime.now(), "1", "1",
                "1", "1", true, true, LocalDateTime.now(), LocalDateTime.now(), "1", true, new Set<Role>() {
                @Override
                public int size() {
                    return 0;
                }

                @Override
                public boolean isEmpty() {
                    return false;
                }

                @Override
                public boolean contains(Object o) {
                    return false;
                }

                @Override
                public Iterator<Role> iterator() {
                    return null;
                }

                @Override
                public Object[] toArray() {
                    return new Object[0];
                }

                @Override
                public <T> T[] toArray(T[] a) {
                    return null;
                }

                @Override
                public boolean add(Role role) {
                    return false;
                }

                @Override
                public boolean remove(Object o) {
                    return false;
                }

                @Override
                public boolean containsAll(Collection<?> c) {
                    return false;
                }

                @Override
                public boolean addAll(Collection<? extends Role> c) {
                    return false;
                }

                @Override
                public boolean retainAll(Collection<?> c) {
                    return false;
                }

                @Override
                public boolean removeAll(Collection<?> c) {
                    return false;
                }

                @Override
                public void clear() {

                }
            });
        MatcherAssert.assertThat(userDTO.getId(), Matchers.notNullValue());
        MatcherAssert.assertThat(userDTO.getFirstName(), Matchers.notNullValue());
        MatcherAssert.assertThat(userDTO.getLastName(), Matchers.notNullValue());
        MatcherAssert.assertThat(userDTO.getUsername(), Matchers.notNullValue());
        MatcherAssert.assertThat(userDTO.getBirthday(), Matchers.notNullValue());
        MatcherAssert.assertThat(userDTO.getEmail(), Matchers.notNullValue());
        MatcherAssert.assertThat(userDTO.getPhone(), Matchers.notNullValue());
        MatcherAssert.assertThat(userDTO.getAddress(), Matchers.notNullValue());
        MatcherAssert.assertThat(userDTO.getPassword(), Matchers.notNullValue());
        MatcherAssert.assertThat(userDTO.getIsActive(), Matchers.notNullValue());
        MatcherAssert.assertThat(userDTO.getIsDelete(), Matchers.notNullValue());
        MatcherAssert.assertThat(userDTO.getCreatedDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(userDTO.getUpdatedDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(userDTO.getVerifyToken(), Matchers.notNullValue());
        MatcherAssert.assertThat(userDTO.getIsEnable(), Matchers.notNullValue());
        MatcherAssert.assertThat(userDTO.getRoles(), Matchers.notNullValue());
    }

    @Test
    public void UserDTOTestNoArgs() {
        UserDTO userDTO = new UserDTO();
        MatcherAssert.assertThat(userDTO.getId(), Matchers.nullValue());
        MatcherAssert.assertThat(userDTO.getFirstName(), Matchers.nullValue());
        MatcherAssert.assertThat(userDTO.getLastName(), Matchers.nullValue());
        MatcherAssert.assertThat(userDTO.getUsername(), Matchers.nullValue());
        MatcherAssert.assertThat(userDTO.getBirthday(), Matchers.nullValue());
        MatcherAssert.assertThat(userDTO.getEmail(), Matchers.nullValue());
        MatcherAssert.assertThat(userDTO.getPhone(), Matchers.nullValue());
        MatcherAssert.assertThat(userDTO.getAddress(), Matchers.nullValue());
        MatcherAssert.assertThat(userDTO.getPassword(), Matchers.nullValue());
        MatcherAssert.assertThat(userDTO.getIsActive(), Matchers.nullValue());
        MatcherAssert.assertThat(userDTO.getIsDelete(), Matchers.nullValue());
        MatcherAssert.assertThat(userDTO.getCreatedDate(), Matchers.nullValue());
        MatcherAssert.assertThat(userDTO.getUpdatedDate(), Matchers.nullValue());
        MatcherAssert.assertThat(userDTO.getVerifyToken(), Matchers.nullValue());
        MatcherAssert.assertThat(userDTO.getIsEnable(), Matchers.nullValue());
        MatcherAssert.assertThat(userDTO.getRoles(), Matchers.nullValue());
    }

    @Test
    public void UserDTOTestGetterSetter() {
        UserDTO userDTO = new UserDTO();
        userDTO.setId("1");
        userDTO.setFirstName("1");
        userDTO.setLastName("1");
        userDTO.setUsername("1");
        userDTO.setBirthday(LocalDateTime.now());
        userDTO.setEmail("1");
        userDTO.setPhone("1");
        userDTO.setAddress("1");
        userDTO.setPassword("1");
        userDTO.setIsActive(true);
        userDTO.setIsDelete(true);
        userDTO.setCreatedDate(LocalDateTime.now());
        userDTO.setUpdatedDate(LocalDateTime.now());
        userDTO.setVerifyToken("1");
        userDTO.setIsEnable(true);
        userDTO.setRoles(new Set<Role>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Role> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Role role) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Role> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        });
        MatcherAssert.assertThat(userDTO.getId(), Matchers.notNullValue());
        MatcherAssert.assertThat(userDTO.getFirstName(), Matchers.notNullValue());
        MatcherAssert.assertThat(userDTO.getLastName(), Matchers.notNullValue());
        MatcherAssert.assertThat(userDTO.getUsername(), Matchers.notNullValue());
        MatcherAssert.assertThat(userDTO.getBirthday(), Matchers.notNullValue());
        MatcherAssert.assertThat(userDTO.getEmail(), Matchers.notNullValue());
        MatcherAssert.assertThat(userDTO.getPhone(), Matchers.notNullValue());
        MatcherAssert.assertThat(userDTO.getAddress(), Matchers.notNullValue());
        MatcherAssert.assertThat(userDTO.getPassword(), Matchers.notNullValue());
        MatcherAssert.assertThat(userDTO.getIsActive(), Matchers.notNullValue());
        MatcherAssert.assertThat(userDTO.getIsDelete(), Matchers.notNullValue());
        MatcherAssert.assertThat(userDTO.getCreatedDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(userDTO.getUpdatedDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(userDTO.getVerifyToken(), Matchers.notNullValue());
        MatcherAssert.assertThat(userDTO.getIsEnable(), Matchers.notNullValue());
        MatcherAssert.assertThat(userDTO.getRoles(), Matchers.notNullValue());
    }

    @Test
    public void UserDTOTestEqualAndHashCode() {
        UserDTO userDTO1 = new UserDTO();
        UserDTO userDTO2 = new UserDTO();
        assertEquals(userDTO1.equals(userDTO2), userDTO2.equals(userDTO1));
        assertEquals(userDTO1.hashCode(), userDTO2.hashCode());
    }
}