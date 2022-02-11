package tran.tuananh.movie.Service;

import tran.tuananh.movie.Table.DTO.CountryDTO;
import tran.tuananh.movie.Table.Response.Response;

public interface CountryService {
    Response getAll();

    Response saveOrUpdate(CountryDTO dto);

    Response getById(CountryDTO dto);

    Response delete(CountryDTO dto);
}
