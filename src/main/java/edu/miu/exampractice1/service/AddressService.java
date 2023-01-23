package edu.miu.exampractice1.service;

import edu.miu.exampractice1.entity.Address;
import edu.miu.exampractice1.entity.Student;

import java.util.List;

public interface AddressService {


    public void save(Address address);
    public List<Address> findAll();
    public Address findAllById(Integer id);
    public void deleteById(Integer id);
}
