package com.mthree.services;

import com.mthree.dtos.EventDTO;
import com.mthree.models.Events;
import com.mthree.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    public Events insertEvent(Events e){
        System.out.println(e);
        return  eventRepository.save(e);
    }

    public List<Events> getAllEvents(){
        return eventRepository.findAll();
    }

    public Events updateEvent(Events event){
        Optional<Events> temp = eventRepository.findById(event.getEventId());
        if(temp.isPresent()){
            Events dataToSave = temp.get();
            dataToSave.setEventName(event.getEventName());
            dataToSave.setEventDuration(event.getEventDuration());
            dataToSave.setStartDateTime(event.getStartDateTime());
            dataToSave.setEndDateTime(event.getEndDateTime());
            return eventRepository.save(dataToSave);
        }
        return null;
    }
}
