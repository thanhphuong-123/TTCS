package tran.tuananh.movie.Table.DTO;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tran.tuananh.movie.Table.Model.Genre;

import java.time.LocalDateTime;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class MovieDTO {

    private Integer id;
    private Integer countryId;
    private String title;
    private String name;
    private Float rate;
    private LocalDateTime releaseDate;
    private Integer runtime;
    private String overview;
    private String trailerUrl;
    private String movieUrl;
    private String posterUrl;
    private Integer ageRestricted;
    private Boolean isActive;
    private Boolean isDelete;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private String createdUserId;
    private String updatedUserId;
    private List<Genre> genres;
}
