package hello.service;

import hello.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventService eventService;

    public List<Event> findByClubname(String clubname) {
        return eventService.findByClubname(clubname);
    }

}