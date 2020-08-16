package com.spring.boot.rest.springrest.repository;

import com.spring.boot.rest.springrest.beans.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address,Integer> {
}
