package tran.tuananh.movie.Service;

import tran.tuananh.movie.Table.DTO.OAuthTokenDTO;
import tran.tuananh.movie.Table.Response.Response;

public interface OAuthService {

    Response signInWithGoolge(OAuthTokenDTO dto);

    Response signInWithFacebook(OAuthTokenDTO dto);
}
