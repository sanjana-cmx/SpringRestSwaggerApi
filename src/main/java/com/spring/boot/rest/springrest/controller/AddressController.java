package com.spring.boot.rest.springrest.controller;

import com.spring.boot.rest.springrest.beans.Address;
import com.spring.boot.rest.springrest.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @GetMapping ("/address" )
    public List<Address> getAddressDetails(){
    return addressService.getAllAddress();
    }
    @GetMapping("/address/{id}")
    public Optional<Address> getAddressById(@PathVariable int id){
        return addressService.getAddressById(id);
    }
    @PostMapping("/add")
    public void addAddressDetails(@RequestBody Address address){
        addressService.addAddress(address);
    }
    @PutMapping("/address/{id}")
    public void updateAddressDetails(@PathVariable int id,@RequestBody Address address){
        addressService.updateAddress(id,address);
    }
    @DeleteMapping("/address/{id}")
    public void deleteAddressDetails(@PathVariable int id){
        addressService.deleteAddress(id);
    }
}
