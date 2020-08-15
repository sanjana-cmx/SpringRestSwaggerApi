package com.spring.boot.rest.springrest.controller;

import com.spring.boot.rest.springrest.beans.Address;
import com.spring.boot.rest.springrest.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @GetMapping ("/address" )
    public List<Address> getAddressDetails(){
    return addressService.getAddressDetails();


    }
}
