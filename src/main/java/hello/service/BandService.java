package hello.service;

import hello.model.Band;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BandService {

    @Autowired
    private BandService bandService;

    public List<Band> findByBandname(String bandname) {
        return bandService.findByBandname(bandname);
    }

}