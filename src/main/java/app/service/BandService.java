package app.service;

import app.model.Band;
import app.repository.BandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BandService {
    @Autowired
    private BandRepository bandRepository;

    public void newBand(Band band) {
        bandRepository.save(band);
    }

    public void updateBand(Band band) {
        Band currentBand = bandRepository.findOne(band.getId() + "");
        bandRepository.delete(currentBand);
        bandRepository.save(band);
    }
}
