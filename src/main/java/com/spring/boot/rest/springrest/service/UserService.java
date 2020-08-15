package com.spring.boot.rest.springrest.service;

import com.spring.boot.rest.springrest.beans.Address;
import com.spring.boot.rest.springrest.beans.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    User user1 = new User(1,"Soumya","Kumari",new Address("Manpur","Navada",823003));
    User user2 = new User(2,"Ranjan","Kumar",new Address("Patwatoli","Raipur",823003));
    User user3 = new User(3,"ABC","Kumari",new Address("XXX","Bihar",823003));
    User user4 = new User(4,"XYZ","Kumar",new Address("YYY","UP",823003));
        private List<User> users= new ArrayList<>(Arrays.asList(user1,user2,user3,user4));


    public List<User> getAllUsers(){
        return users;
    }
     public User getUser(int id){
       // User user = users.get(id); Based on Array Index
         User user = users.stream().filter(t ->id==(t.getId())).findFirst().orElseThrow(null);

        return  user;
     }

   /* public User getUserByAddress(Address address){
        // User user = users.get(id); Based on Array Index
        User user = users.stream().filter(t ->address.equals(t.getAddress())).findFirst().orElseThrow(null);

        return  user;
    }*/

    public void addUser(User user){
     //ArrayList<User> userArrayList = new ArrayList<User>();
     users.add(user);
    }
}
