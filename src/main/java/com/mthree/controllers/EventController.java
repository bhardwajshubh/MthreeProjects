package com.mthree.controllers;


import com.mthree.dtos.EventDTO;
import com.mthree.models.Events;
import com.mthree.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
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
        System.out.println(result);
        return result;
    }

    @PatchMapping("/")
    public Events UpdateThisEvent(@RequestBody Events event){
        Events result = eventService.updateEvent(event);
        System.out.println(result);
        return result;
    }

}
