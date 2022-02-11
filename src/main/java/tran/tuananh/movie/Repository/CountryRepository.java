package tran.tuananh.movie.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tran.tuananh.movie.Table.Model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
}
