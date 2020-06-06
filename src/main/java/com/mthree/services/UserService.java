package com.mthree.services;


import com.mthree.dtos.UserDTO;
import com.mthree.models.Users;
import com.mthree.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<Users> getUsers(){
        return userRepository.findAll();
    }

    public Users mapUserToEvent(Users users){
        Users result = userRepository.save(users);
        return result;
    }

    public List<UserDTO> findAllUsersOfEvent(int eventId){
        return userRepository.findUsersByEventId(eventId);
    }

    public void deleteUser(int userId){
        userRepository.deleteById(userId);
    }


}
