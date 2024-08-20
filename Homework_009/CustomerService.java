package de.ait_tr.shop.service.interfaces;

import de.ait_tr.shop.model.entity.Customer;

import java.util.List;

public interface CustomerService {

    public Customer saveCustomer( Customer customer);

    public Customer getById(long id);

    public List<Customer> grtAll();

    public Customer updateCustomer (Long id, Customer customer);

    public Customer remove(Long id);

    public Customer remuveByName (String name);

    public Customer restoreById(Long id);

    public Customer getCustomerCount();

}
