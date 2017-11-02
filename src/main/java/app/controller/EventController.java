package app.controller;

import app.model.Event;
import app.service.annotations.Role;
import org.springframework.web.bind.annotation.*;

import static app.model.User.Role.CLUBMASTER;

@RestController
public class EventController {
    @Role({CLUBMASTER})
    @GetMapping("/event")
    private String myEvents(){
        return "rendezvényeim";
    }

    @Role({CLUBMASTER})
    @PostMapping("/event")
    public String newEvent(@RequestBody Event event){
        return "új rendezvény létrehozva";
    }

    @Role({CLUBMASTER})
    @PutMapping("/event")
    public String updateEvent(@RequestBody Event event) {
        return "rendezvény adatai frissítve";
    }
}
