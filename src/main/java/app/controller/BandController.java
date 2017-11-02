package app.controller;

import app.model.User;
import app.service.Session;
import app.service.annotations.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static app.model.User.Role.ADMIN;
import static app.model.User.Role.BANDMASTER;

@RestController
public class BandController {
    @Autowired
    Session session;

    @Role({ADMIN, BANDMASTER})
    @GetMapping("/myband")
    public String myBand() {
        if(session.getUser() != null) {
            return session.getUser().getRole().toString();
        }
        else
            return "not logged in";

    }
}
