package com.spring.boot.rest.springrest.controller;

import com.spring.boot.rest.springrest.beans.Address;
import com.spring.boot.rest.springrest.beans.User;
import com.spring.boot.rest.springrest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/user")
    public List<User> getUserDetails(){
     return userService.getAllUsers();

    }
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable int id){
        return userService.getUser(id);

    }
    @PostMapping("/addUser")
    public void addUser(@RequestBody User user){
       userService.addUser(user);

    }
   /* @GetMapping("/add/{address}")
    public User getUserByAddress(@PathVariable Address address){
        return userService.getUserByAddress(address);

    }*/
}
