package com.spring.boot.rest.springrest.service;

import com.spring.boot.rest.springrest.beans.Address;
import com.spring.boot.rest.springrest.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
/* // Without Adding Repository we can test by below process
    Address address1 = new Address(100,"Pehani","Gaya",560010);
    Address address2 = new Address(1001,"Whitefield","Banglore",603103);
        private List<Address> addressList= Arrays.asList(address1,address2);

        public List<Address> getAddressDetails(){
            return addressList;
        }*/
    @Autowired
    private AddressRepository addressRepository;

    public  List<Address> getAllAddress(){
            List<Address> addresses = new ArrayList<>();
         addressRepository.findAll()
                 .forEach(addresses ::add);
         return addresses;

    }
    public Optional<Address> getAddressById(int id){
     return addressRepository.findById(id);
    }
    public void addAddress(Address address){
        addressRepository.save(address);
    }
    public void deleteAddress(int id){

        addressRepository.deleteById(id);
    }

    public void updateAddress(int id,Address address){
         addressRepository.save(address);
    }
}
