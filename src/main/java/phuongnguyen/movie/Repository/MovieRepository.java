package phuongnguyen.movie.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import phuongnguyen.movie.Table.Model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
