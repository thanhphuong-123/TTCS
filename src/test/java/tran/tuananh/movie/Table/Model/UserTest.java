package tran.tuananh.movie.Table.Model;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void UserTestAllArgs() {
        User user =
            new User("1", "1", "1", "1", LocalDateTime.now(), "1", "1",
                "1", "1", true, true, LocalDateTime.now(), LocalDateTime.now(), true, new Set<Role>() {
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
        MatcherAssert.assertThat(user.getId(), Matchers.notNullValue());
        MatcherAssert.assertThat(user.getFirstName(), Matchers.notNullValue());
        MatcherAssert.assertThat(user.getLastName(), Matchers.notNullValue());
        MatcherAssert.assertThat(user.getUsername(), Matchers.notNullValue());
        MatcherAssert.assertThat(user.getBirthday(), Matchers.notNullValue());
        MatcherAssert.assertThat(user.getEmail(), Matchers.notNullValue());
        MatcherAssert.assertThat(user.getPhone(), Matchers.notNullValue());
        MatcherAssert.assertThat(user.getAddress(), Matchers.notNullValue());
        MatcherAssert.assertThat(user.getPassword(), Matchers.notNullValue());
        MatcherAssert.assertThat(user.getIsActive(), Matchers.notNullValue());
        MatcherAssert.assertThat(user.getIsDelete(), Matchers.notNullValue());
        MatcherAssert.assertThat(user.getCreatedDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(user.getUpdatedDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(user.getIsEnable(), Matchers.notNullValue());
        MatcherAssert.assertThat(user.getRoles(), Matchers.notNullValue());
    }

    @Test
    public void UserTestNoArgs() {
        User user = new User();
        MatcherAssert.assertThat(user.getId(), Matchers.nullValue());
        MatcherAssert.assertThat(user.getFirstName(), Matchers.nullValue());
        MatcherAssert.assertThat(user.getLastName(), Matchers.nullValue());
        MatcherAssert.assertThat(user.getUsername(), Matchers.nullValue());
        MatcherAssert.assertThat(user.getBirthday(), Matchers.nullValue());
        MatcherAssert.assertThat(user.getEmail(), Matchers.nullValue());
        MatcherAssert.assertThat(user.getPhone(), Matchers.nullValue());
        MatcherAssert.assertThat(user.getAddress(), Matchers.nullValue());
        MatcherAssert.assertThat(user.getPassword(), Matchers.nullValue());
        MatcherAssert.assertThat(user.getIsActive(), Matchers.nullValue());
        MatcherAssert.assertThat(user.getIsDelete(), Matchers.nullValue());
        MatcherAssert.assertThat(user.getCreatedDate(), Matchers.nullValue());
        MatcherAssert.assertThat(user.getUpdatedDate(), Matchers.nullValue());
        MatcherAssert.assertThat(user.getIsEnable(), Matchers.nullValue());
        MatcherAssert.assertThat(user.getRoles(), Matchers.nullValue());
    }

    @Test
    public void UserTestGetterSetter() {
        User user = new User();
        user.setId("1");
        user.setFirstName("1");
        user.setLastName("1");
        user.setUsername("1");
        user.setBirthday(LocalDateTime.now());
        user.setEmail("1");
        user.setPhone("1");
        user.setAddress("1");
        user.setPassword("1");
        user.setIsActive(true);
        user.setIsDelete(true);
        user.setCreatedDate(LocalDateTime.now());
        user.setUpdatedDate(LocalDateTime.now());
        user.setIsEnable(true);
        user.setRoles(new Set<Role>() {
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
        MatcherAssert.assertThat(user.getId(), Matchers.notNullValue());
        MatcherAssert.assertThat(user.getFirstName(), Matchers.notNullValue());
        MatcherAssert.assertThat(user.getLastName(), Matchers.notNullValue());
        MatcherAssert.assertThat(user.getUsername(), Matchers.notNullValue());
        MatcherAssert.assertThat(user.getBirthday(), Matchers.notNullValue());
        MatcherAssert.assertThat(user.getEmail(), Matchers.notNullValue());
        MatcherAssert.assertThat(user.getPhone(), Matchers.notNullValue());
        MatcherAssert.assertThat(user.getAddress(), Matchers.notNullValue());
        MatcherAssert.assertThat(user.getPassword(), Matchers.notNullValue());
        MatcherAssert.assertThat(user.getIsActive(), Matchers.notNullValue());
        MatcherAssert.assertThat(user.getIsDelete(), Matchers.notNullValue());
        MatcherAssert.assertThat(user.getCreatedDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(user.getUpdatedDate(), Matchers.notNullValue());
        MatcherAssert.assertThat(user.getIsEnable(), Matchers.notNullValue());
        MatcherAssert.assertThat(user.getRoles(), Matchers.notNullValue());
    }

    @Test
    public void UserTestEqualAndHashCode() {
        User user1 = new User();
        User user2 = new User();
        assertEquals(user1.equals(user2), user2.equals(user1));
        assertEquals(user1.hashCode(), user2.hashCode());
    }
}