package app.controller;

import app.model.Band;
import app.repository.BandRepository;
import app.service.BandService;
import app.service.Session;
import app.service.annotations.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import static app.model.User.Role.BANDMASTER;



@RestController
public class BandController {

    @Autowired
    Session session;

    @Autowired
    BandRepository bandRepository;

    @Autowired
    BandService bandService;

    @Role({BANDMASTER})
    @GetMapping("/band")
    private String myBand() {
        Band band = bandRepository.findByBandmaster(session.getUser().getUsername());
        return band.toString();
    }

    @Role({BANDMASTER})
    @PostMapping("/band")
    public String newBand(@RequestBody Band band) {
        bandService.newBand(band);
        return "új zenekar létrehozva";
    }

    @Role({BANDMASTER})
    @PutMapping("/band")
    public String updateBand(@RequestBody Band band) {
        bandService.updateBand(band);
        return "zenekar adatai frissítve";
    }
}
