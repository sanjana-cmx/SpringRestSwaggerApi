package com.spring.boot.rest.springrest.service;

import com.spring.boot.rest.springrest.beans.Address;
import com.spring.boot.rest.springrest.beans.User;
import com.spring.boot.rest.springrest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
/*

    User user1 = new User(1,"Soumya","Kumari",new Address(100,"Manpur","Bihar",823003));
    User user2 = new User(2,"Ranjan","Kumar",new Address(101,"Gaya","Bihar",823063));
    User user3 = new User(3,"ABC","Kumari",new Address(102,"Delhi","Bihar",823005));
    User user4 = new User(4,"XYZ","Kumar",new Address(103,"Varanasi","Bihar",823004));
        private List<User> users= new ArrayList<>(Arrays.asList(user1,user2,user3,user4));
*/
@Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        List<User> users= new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }
    public List<User> getUsersByAddressId(int id){
        List<User> users= new ArrayList<>();
        userRepository.findByAddressId(id).forEach(users::add);
        return users;
    }
     public User getUserById(int id){
       /*// User user = users.get(id); Based on Array Index
         User user = users.stream().filter(t ->id==(t.getId())).findFirst().orElseThrow(null);
          return  user;*/
         return  userRepository.findOne(id)    ;
    }

    public void addUser(User user){
     //ArrayList<User> userArrayList = new ArrayList<User>();
     userRepository.save(user);
    }

    public void deleteUser(int id){
        userRepository.delete(id);
    }

    public void updateUser(int id,User user){
        userRepository.save(user);
    }
}
