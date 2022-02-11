package tran.tuananh.movie.Service;

import tran.tuananh.movie.Table.DTO.GenreDTO;
import tran.tuananh.movie.Table.Response.Response;

public interface GenreService {
    Response getAll();

    Response saveOrUpdate(GenreDTO dto);

    Response getById(GenreDTO dto);

    Response delete(GenreDTO dto);
}
