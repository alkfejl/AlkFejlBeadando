package app.service;

import app.model.Event;
import app.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    public void newEvent(Event event) {
        eventRepository.save(event);
    }

    public void updateEvent(Event event) {
        Event currentEvent = eventRepository.findOne(event.getId() + "");
        eventRepository.delete(currentEvent);
        eventRepository.save(event);
    }
}
