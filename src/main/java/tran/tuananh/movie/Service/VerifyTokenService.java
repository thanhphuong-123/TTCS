package tran.tuananh.movie.Service;

import tran.tuananh.movie.Table.DTO.UserDTO;
import tran.tuananh.movie.Table.Model.User;
import tran.tuananh.movie.Table.Model.VerifyToken;
import tran.tuananh.movie.Table.Response.Response;

public interface VerifyTokenService {

    VerifyToken createVerifyToken(User user);

    Response verifyToken(UserDTO user);
}
