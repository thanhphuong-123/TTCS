package tran.tuananh.movie.Table.DTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.sql.Timestamp;

@Data
@EqualsAndHashCode(callSuper = false)
public class GenreDTO {

    private Integer id;
    private String name;
    private Boolean is_active;
    private Boolean is_delete;
    private Timestamp created_date;
    private Timestamp updated_date;
    private String created_user_id;
    private String updated_user_id;
}
