package com.spring.boot.rest.springrest.service;

import com.spring.boot.rest.springrest.beans.Address;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class AddressService {

    Address address1 = new Address("Pehani","Gaya",560010);
    Address address2 = new Address("Whitefield","Banglore",603103);
        private List<Address> addressList= Arrays.asList(address1,address2);

        public List<Address> getAddressDetails(){
            return addressList;
        }
}
