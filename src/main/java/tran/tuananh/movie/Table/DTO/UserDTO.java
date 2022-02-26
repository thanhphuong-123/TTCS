package tran.tuananh.movie.Table.DTO;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tran.tuananh.movie.Table.Model.Role;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = false)
public class UserDTO {

    private String id;
    private String firstName;
    private String lastName;
    private String username;
    private LocalDateTime birthday;
    private String email;
    private String phone;
    private String address;
    private String password;
    private Boolean isActive;
    private Boolean isDelete;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private String verifyToken;
    private Boolean isEnable;
    private Set<Role> roles;
}
