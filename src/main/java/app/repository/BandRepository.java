package app.repository;

import app.model.Band;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BandRepository extends CrudRepository<Band, String> {
    Optional<Band> findByBandname(String bandname);
}
