package org.example.controllers;


import org.example.dto.UserDto;
import org.example.model.User;
import org.example.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("")
    public List<User> getUsers(){
        return userService.findAllUsers();
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
