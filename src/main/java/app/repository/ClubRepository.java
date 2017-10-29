package app.repository;

import app.model.Club;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClubRepository extends CrudRepository<Club, String> {
    Optional<Club> findByClubname(String clubname);
}
