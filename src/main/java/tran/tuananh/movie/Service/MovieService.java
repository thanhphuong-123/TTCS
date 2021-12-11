package tran.tuananh.movie.Service;

import tran.tuananh.movie.Table.DTO.GenreDTO;
import tran.tuananh.movie.Table.DTO.MovieDTO;
import tran.tuananh.movie.Table.Response.Response;

public interface MovieService {
    public Response getAll();

    public Response saveOrUpdate(MovieDTO dto);

    public Response getById(MovieDTO dto);

    public Response delete(MovieDTO dto);

    public Response getMovieByGenre(GenreDTO dto);
}
