package app.controller;

import app.model.Club;
import app.repository.ClubRepository;
import app.service.ClubService;
import app.service.Session;
import app.service.annotations.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static app.model.User.Role.CLUBMASTER;

@RestController
public class ClubController {

    @Autowired
    Session session;

    @Autowired
    ClubService clubService;

    @Autowired
    ClubRepository clubRepository;

    @Role({CLUBMASTER})
    @GetMapping("/club")
    private String myClub(){
        Club club = clubRepository.findByClubmaster(session.getUser().getUsername());
        return club.toString();
    }

    @Role({CLUBMASTER})
    @PostMapping("/club")
    public String newClub(@RequestBody Club club){
        clubService.newClub(club);
        return "új klub létrehozva";
    }

    @Role({CLUBMASTER})
    @PutMapping("/club")
    public String updateClub(@RequestBody Club club) {
        clubService.updateClub(club);
        return "klub adatai frissítve";
    }
}