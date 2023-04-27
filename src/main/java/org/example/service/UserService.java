package org.example.service;

import org.example.dto.UserDto;
import org.example.model.BankCard;
import org.example.model.User;

import java.util.List;

public class UserService {
    public UserService(){
    }
    private UserDto userDto = new UserDto();
    public User findUserId(int id){
        return userDto.findById(id);
    }
    public void saveUser(User user){
        userDto.save(user);
    }
    public void deleteUser(User user){
        userDto.delete(user);
    }
    public void deleteUserById(int id){
        userDto.delete(id);
    }
    public void updateUser(User user){
        userDto.update(user);
    }
    public List<User> findAllUsers(){
        return userDto.findAll();
    }
    public BankCard findBankCardById(int id){
        return userDto.findBankCardById(id);
    }
}
