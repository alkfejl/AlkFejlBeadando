package app.repository;

import app.model.Band;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BandRepository extends CrudRepository<Band, String> {
    Band findByBandmaster(String bandmaster);
}
