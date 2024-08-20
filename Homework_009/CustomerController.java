package de.ait_tr.shop.controller;

import de.ait_tr.shop.model.entity.Customer;
import de.ait_tr.shop.service.interfaces.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public Customer saveCustomer(@RequestBody Customer customer){
        // Todo обращаемся к сервису для сохранения клиента
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/{customer_id}")
    public Customer getById(@PathVariable("customer_id") long id){
        // Todo обращаемся к сервису для получения клиента по id
        return customerService.getById(id);
    }


    @PutMapping("/{id}")
    public Customer updateCustomer (@PathVariable Long id, @RequestBody Customer customer) {
        return customerService.updateCustomer(id, customer);
    }

    @DeleteMapping("/{id}")
    public Customer remove(@PathVariable Long id){
        return customerService.remove(id);
    }

    @GetMapping
    public List<Customer> grtAll(){
        return customerService.grtAll();
    }

    @DeleteMapping("/by-name")
    public Customer remuveByName(String name) {
        return customerService.remuveByName(name);
    }

    @PutMapping("/restore/{id}")
    public Customer restoreById(Long id) {
        return customerService.restoreById(id);
    }

    @GetMapping("/count")
    public Customer getCustomerCount() {
        return customerService.getCustomerCount();
    }

}
