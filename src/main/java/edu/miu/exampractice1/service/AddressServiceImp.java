package edu.miu.exampractice1.service;

import edu.miu.exampractice1.entity.Address;
import edu.miu.exampractice1.entity.Student;
import edu.miu.exampractice1.repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImp implements AddressService{


    @Autowired
    private AddressRepo addressRepo;


    @Override
    public void save(Address address) {
        addressRepo.save(address);
    }

    @Override
    public List<Address> findAll() {
        return addressRepo.findAll();
    }


    @Override
    public Address findAllById(Integer id) {
        return addressRepo.findById(id).get();
    }

    @Override
    public void deleteById(Integer id) {
      addressRepo.deleteById(id);
    }


}
