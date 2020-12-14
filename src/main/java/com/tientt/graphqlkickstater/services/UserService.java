package com.tientt.graphqlkickstater.services;

import com.tientt.graphqlkickstater.entities.User;
import com.tientt.graphqlkickstater.entities.UserInput;
import com.tientt.graphqlkickstater.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User getUserByUsername(String username){
        return userRepository.findById(username).get();
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User addUser(UserInput userInput){
        User user = new User();
        user.setUsername(userInput.getUsername());
        user.setPassword(userInput.getPassword());
        user.setLastname(userInput.getLastname());
        user.setRole(userInput.isRole());
        userRepository.saveAndFlush(user);
        return user;
    }
}
