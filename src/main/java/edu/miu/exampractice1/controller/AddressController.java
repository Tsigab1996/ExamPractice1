package edu.miu.exampractice1.controller;

import edu.miu.exampractice1.entity.Address;
import edu.miu.exampractice1.entity.Student;
import edu.miu.exampractice1.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/address")
public class AddressController {

    @Autowired
    private  AddressService addressService;


    @PostMapping
    public void save(@RequestBody Address address){
        addressService.save(address);
    }
}
