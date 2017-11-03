package app.service;

import app.model.Club;
import app.repository.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClubService {
    @Autowired
    private ClubRepository clubRepository;

    public void newClub(Club club) {
        clubRepository.save(club);
    }

    public void updateClub(Club club) {
        Club currentClub = clubRepository.findOne(club.getId() + "");
        clubRepository.delete(currentClub);
        clubRepository.save(club);
    }
}
