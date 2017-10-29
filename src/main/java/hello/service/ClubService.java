package hello.service;

import hello.model.Club;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubService {

    @Autowired
    private ClubService clubService;

    public List<Club> findByClubname(String clubname) {
        return clubService.findByClubname(clubname);
    }

}