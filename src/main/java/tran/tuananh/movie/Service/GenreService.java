package tran.tuananh.movie.Service;

import tran.tuananh.movie.Table.DTO.GenreDTO;
import tran.tuananh.movie.Table.Response.Response;

public interface GenreService {
    public Response getAll();

    public Response saveOrUpdate(GenreDTO dto);

    public Response getById(GenreDTO dto);

    public Response delete(GenreDTO dto);
}
