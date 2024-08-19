package de.ait_tr.shop.controller;

import de.ait_tr.shop.model.entity.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @PostMapping
    public Customer saveProduct(@RequestBody Customer customer){
        // Todo обращаемся к сервису для сохранения клиента
        return customer;
    }

    @GetMapping("/{id}")
    public Customer getById(@PathVariable("customer_id") long id){
        // Todo обращаемся к сервису для получения клиента по id
        return null;
    }


    @PutMapping("/{id}")
    public Customer updateProduct (@PathVariable Long id, @RequestBody Customer customer) {
        return customer;
    }

    @DeleteMapping("/{id}")
    public Customer remove(@PathVariable Long id){
        return null;
    }

    @GetMapping
    public List<Customer> grtAll(){
        return null;
    }
}
