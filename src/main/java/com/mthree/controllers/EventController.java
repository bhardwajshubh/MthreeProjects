package com.mthree.controllers;



import com.mthree.models.Events;
import com.mthree.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {
    @Autowired
    private EventService eventService;

    @PostMapping("/")
    public  Events createEvent(@RequestBody Events e){
        Events result = eventService.insertEvent(e);
        return result;
    }

    @GetMapping("/")
    public List<Events> viewAllEvents(){
        List<Events> result = eventService.getAllEvents();
        return result;
    }

    @PatchMapping("/")
    public Events UpdateThisEvent(@RequestBody Events event){
        Events result = eventService.updateEvent(event);
        return result;
    }

    @DeleteMapping("/{eventId}")
    public String removeEvent(@PathVariable("eventId") int eventId){
        eventService.deleteEvent(eventId);
        return "{ \"status\" : \"success\" }";
    }

}
