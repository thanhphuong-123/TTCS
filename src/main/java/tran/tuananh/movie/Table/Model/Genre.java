package tran.tuananh.movie.Table.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "genre")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "is_active")
    private Boolean is_active;

    @Column(name = "is_delete")
    private Boolean is_delete;

    @Column(name = "created_date")
    private Timestamp created_date;

    @Column(name = "updated_date")
    private Timestamp updated_date;

    @Column(name = "created_user_id")
    private String created_user_id;

    @Column(name = "updated_user_id")
    private String updated_user_id;

    @JsonIgnore
    @ManyToMany(mappedBy = "genres")
    private List<Movie> movies;
}
