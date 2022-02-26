package tran.tuananh.movie.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tran.tuananh.movie.Table.Model.VerifyToken;

@Repository
public interface VerifyTokenRepository extends JpaRepository<VerifyToken, String> {

    VerifyToken findByUserId(String userId);
}
