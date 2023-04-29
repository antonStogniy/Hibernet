package org.example.controllers;


import org.example.dto.UserDto;
import org.example.model.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/users/")
    public List<User> getUsers(){
        return userService.findAllUsers();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable int id){
        return  userService.findUserId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser(@RequestBody User user){
        userService.saveUser(user);
    }
    @DeleteMapping(value = "/{user}")
    public void deleteUser(@PathVariable("user") int id){
        userService.deleteUserById(id);
    }

}
