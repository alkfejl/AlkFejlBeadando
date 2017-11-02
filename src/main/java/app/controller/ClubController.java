package app.controller;

import app.model.Club;
import app.service.annotations.Role;
import org.springframework.web.bind.annotation.*;

import static app.model.User.Role.CLUBMASTER;

@RestController
public class ClubController {

    @Role({CLUBMASTER})
    @GetMapping("/club")
    private String myClub(){
        return "klubom";
    }

    @Role({CLUBMASTER})
    @PostMapping("/club")
    public String newClub(@RequestBody Club club){
        return "új klub létrehozva";
    }

    @Role({CLUBMASTER})
    @PutMapping("/club")
    public String updateClub(@RequestBody Club club) {
        return "klub adatai frissítve";
    }
}