package com.kotalicious.kotabusiness.service;

import com.kotalicious.kotabusiness.model.Customer;

import java.util.Optional;

public interface CustomerService {
    Customer createUser(Customer customer);
    Customer findByEmail(String email);
    void changePassword();
    Customer findByUsername(String username);

}
