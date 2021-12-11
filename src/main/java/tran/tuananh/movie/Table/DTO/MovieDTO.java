package tran.tuananh.movie.Table.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tran.tuananh.movie.Table.Model.Genre;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class MovieDTO {

    private Integer id;
    private Integer country_id;
    private String title;
    private String name;
    private Float rate;
    private Timestamp release_date;
    private Integer runtime;
    private String overview;
    private String trailer_url;
    private String movie_url;
    private String poster_url;
    private Integer age_restricted;
    private Boolean is_active;
    private Boolean is_delete;
    private Timestamp created_date;
    private Timestamp updated_date;
    private String created_user_id;
    private String updated_user_id;
    private List<Genre> genres;
}
