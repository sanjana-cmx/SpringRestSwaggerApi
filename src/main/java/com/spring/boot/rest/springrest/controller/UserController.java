package com.spring.boot.rest.springrest.controller;

import com.spring.boot.rest.springrest.beans.User;
import com.spring.boot.rest.springrest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/user")
    public List<User> getUserDetails(){
     return userService.getAllUsers();

    }
    @GetMapping("/user/{id}")
    public Optional<User> getUser(@PathVariable int id){
        return userService.getUserById(id);

    }
    @GetMapping("user/address/{addressId}")
    public List<User> getUsersByAddressId(@PathVariable int addressId) {
      return userService.getUsersByAddressId(addressId);
    }
    @GetMapping("user/firstname/{firstname}")
    public List<User> getUsersByFirstname(@PathVariable String firstname) {
        return userService.getUsersByFirstName(firstname);
    }
    @PostMapping("/addUser")
    public void addUser(@RequestBody User user){
       userService.addUser(user);

    }
  @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable int id){
        userService.deleteUser(id);
  }
  @PutMapping("/user/{id}")
    public void updateUser(@PathVariable int id,@RequestBody User user){
        userService.updateUser(id,user);
  }

}
