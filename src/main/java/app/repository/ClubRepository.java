package app.repository;

import app.model.Club;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubRepository extends CrudRepository<Club, String> {
    Club findByClubmaster(String username);
}
