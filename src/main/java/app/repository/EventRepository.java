package app.repository;

import app.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EventRepository extends CrudRepository<Event, String> {
    Optional<Event> findByClubname(String clubname);

    Optional<Event> findByBandname(String bandname);
}
