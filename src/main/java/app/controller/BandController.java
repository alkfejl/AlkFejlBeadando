package app.controller;

import app.model.Band;
import app.service.Session;
import app.service.annotations.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import static app.model.User.Role.BANDMASTER;



@RestController
public class BandController {

    @Autowired
    Session session;

    @Role({BANDMASTER})
    @GetMapping("/band")
    private String myBand() {
        return session.getUser().getRole().toString();
    }

    @Role({BANDMASTER})
    @PostMapping("/band")
    public String newBand(@RequestBody Band band) {
        return "új zenekar létrehozva";
    }

    @Role({BANDMASTER})
    @PutMapping("/band")
    public String updateBand(@RequestBody Band band) {
        return "zenekar adatai frissítve";
    }
}
