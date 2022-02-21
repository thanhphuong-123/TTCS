package tran.tuananh.movie.Service;

import tran.tuananh.movie.Table.DTO.UserDTO;
import tran.tuananh.movie.Table.Model.RefreshToken;
import tran.tuananh.movie.Table.Response.Response;

public interface UserService {

    Response getAll();

    Response signUp(UserDTO dto);

    Response signIn(UserDTO dto);

    Response refreshToken(RefreshToken refreshToken);

    Response getById(UserDTO dto);

    Response delete(UserDTO dto);

    Response existsByUsername(String username);

    Response existsByEmail(String email);
}
