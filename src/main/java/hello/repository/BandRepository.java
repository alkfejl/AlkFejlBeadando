package hello.repository;

import hello.model.Band;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BandRepository extends CrudRepository<Band, Long> {

    Band findByBandname(String bandname);
}