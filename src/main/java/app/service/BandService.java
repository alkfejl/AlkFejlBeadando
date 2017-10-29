package app.service;

import app.model.Band;
import app.repository.BandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BandService {
    @Autowired
    private BandRepository bandRepository;

    public void newBand(Band band) {
        bandRepository.save(band);
    }
}
