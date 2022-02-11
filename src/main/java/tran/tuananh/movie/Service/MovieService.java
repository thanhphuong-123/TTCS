package tran.tuananh.movie.Service;

import tran.tuananh.movie.Table.DTO.GenreDTO;
import tran.tuananh.movie.Table.DTO.MovieDTO;
import tran.tuananh.movie.Table.Response.Response;

public interface MovieService {
    Response getAll();

    Response saveOrUpdate(MovieDTO dto);

    Response getById(MovieDTO dto);

    Response delete(MovieDTO dto);

    Response getMovieByGenre(GenreDTO dto);
}
