package tran.tuananh.movie.Service;

import tran.tuananh.movie.Table.DTO.RoleDTO;
import tran.tuananh.movie.Table.Response.Response;

public interface RoleService {
    Response getAll();

    Response saveOrUpdate(RoleDTO dto);

    Response getById(RoleDTO dto);

    Response delete(RoleDTO dto);
}
