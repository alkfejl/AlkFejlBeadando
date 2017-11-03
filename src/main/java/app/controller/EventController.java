package app.controller;

import app.model.Event;
import app.repository.EventRepository;
import app.service.EventService;
import app.service.annotations.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static app.model.User.Role.CLUBMASTER;

@RestController
public class EventController {

    @Autowired
    EventRepository eventRepository;

    @Autowired
    EventService eventService;

    @Role({CLUBMASTER})
    @GetMapping("/event")
    private String myEvent(){

        return "rendezvényem";
    }

    @Role({CLUBMASTER})
    @PostMapping("/event")
    public String newEvent(@RequestBody Event event){
        eventService.newEvent(event);
        return "új rendezvény létrehozva";
    }

    @Role({CLUBMASTER})
    @PutMapping("/event")
    public String updateEvent(@RequestBody Event event) {
        eventService.updateEvent(event);
        return "rendezvény adatai frissítve";
    }
}
