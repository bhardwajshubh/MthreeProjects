package com.mthree.controllers;


import com.mthree.dtos.UserDTO;
import com.mthree.models.Users;
import com.mthree.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
