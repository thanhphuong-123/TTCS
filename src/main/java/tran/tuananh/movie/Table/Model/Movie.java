package tran.tuananh.movie.Table.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "movie")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "country_id")
    private Integer country_id;

    @Column(name = "title")
    private String title;

    @Column(name = "name")
    private String name;

    @Column(name = "rate")
    private Float rate;

    @Column(name = "release_date")
    private Timestamp release_date;

    @Column(name = "runtime")
    private Integer runtime;

    @Column(name = "overview")
    private String overview;

    @Column(name = "trailer_url")
    private String trailer_url;

    @Column(name = "movie_url")
    private String movie_url;

    @Column(name = "poster_url")
    private String poster_url;

    @Column(name = "age_restricted")
    private Integer age_restricted;

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

    @ManyToMany
    @JoinTable(name = "movie_genre", joinColumns = @JoinColumn(name = "movie_id"), inverseJoinColumns =
    @JoinColumn(name = "genre_id"))
    private List<Genre> genres;
}
