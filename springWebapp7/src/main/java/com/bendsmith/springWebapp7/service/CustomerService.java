package com.bendsmith.springWebapp7.service;

import java.util.List;

import com.bendsmith.springWebapp7.model.*;

public interface CustomerService {

    public List < Customer > getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);

}
