package hello.repository;

import hello.model.Club;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClubRepository extends CrudRepository<Club, Long> {

    Club findByClubname(String clubname);
}