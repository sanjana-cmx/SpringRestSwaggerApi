package com.spring.boot.rest.springrest.repository;

import com.spring.boot.rest.springrest.beans.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository  extends CrudRepository<User,Integer> {

    public List<User> findByAddressId(int addressId);
}
