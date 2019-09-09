package com.bendsmith.springWebapp7.dao;

import java.util.List;

import com.bendsmith.springWebapp7.model.*;

public interface CustomerDAO {

    public List < Customer > getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);
}
