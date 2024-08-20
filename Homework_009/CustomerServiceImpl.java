package de.ait_tr.shop.service;

import de.ait_tr.shop.model.entity.Customer;
import de.ait_tr.shop.repository.CustomerRepository;
import de.ait_tr.shop.service.interfaces.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository repository;

    public CustomerServiceImpl(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        customer.setActive(true);
        return repository.save(customer);
    }

    @Override
    public Customer getById(long id) {
        Customer customer = repository.findById(id).orElse(null);
        if (customer == null || !customer.isActive()) {
            return null;
        }
        return customer;
    }

    @Override
    public List<Customer> grtAll() {
        return repository.findAll().stream()
                .filter(Customer::isActive)
                .toList();
    }

    @Override
    public Customer updateCustomer(Long id, Customer customer) {
        return null;
    }

    @Override
    public Customer remove(Long id) {
        return null;
    }

    @Override
    public Customer remuveByName(String name) {
        return null;
    }

    @Override
    public Customer restoreById(Long id) {
        return null;
    }

    @Override
    public Customer getCustomerCount() {
        return null;
    }
}
