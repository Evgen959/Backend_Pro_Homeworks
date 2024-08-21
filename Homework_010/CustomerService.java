package de.ait_tr.shop.service.interfaces;

import de.ait_tr.shop.model.dto.CustomerDTO;
import de.ait_tr.shop.model.entity.Customer;

import java.math.BigDecimal;
import java.util.List;

public interface CustomerService {

    public CustomerDTO saveCustomer(CustomerDTO customerDTO);

    public CustomerDTO getById(long id);

    public List<CustomerDTO> grtAll();

    public CustomerDTO updateCustomer (CustomerDTO customerDTOr);

    public CustomerDTO remove(Long id);

    public CustomerDTO remuveByName (String name);

    public CustomerDTO restoreById(Long id);

    public long getCustomerCount();

    BigDecimal getTotalCostOfCustomerProducts(long customerId);

    BigDecimal getAverageCostOfCustomerProducts(long customerId);

    void addProductToCustomerCart(long customerId, long productId);

    void remouveProductToCustomerCart(long customerId, long productId);

    void remouveCustomerCart(long customerId);
}
