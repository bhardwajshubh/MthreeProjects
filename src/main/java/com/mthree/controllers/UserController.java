package com.mthree.controllers;

import com.mthree.dtos.UserDTO;
import com.mthree.models.Events;
import com.mthree.models.Users;
import com.mthree.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<Users> getAllUsers(){
        return userService.getUsers();
    }

    @PostMapping("/{eventId}")
    public Users insertUser(@RequestBody Users users, @PathVariable("eventId") int eventId){
        users.setEvent(new Events(eventId , "" ,"" , null , null));
        Users result = userService.mapUserToEvent(users);
        return result;
    }

    @GetMapping("/{eventId}")
    public List<UserDTO> getAllUsersOfEvent(@PathVariable("eventId") int eventId){
        return userService.findAllUsersOfEvent(eventId);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable int userId){
        userService.deleteUser(userId);
    }
}
