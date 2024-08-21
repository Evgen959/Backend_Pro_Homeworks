package de.ait_tr.shop.service.mapping;

import de.ait_tr.shop.model.dto.CustomerDTO;
import de.ait_tr.shop.model.entity.Customer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-21T16:48:54+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.11 (Oracle Corporation)"
)
@Component
public class CustomerMappingServiceImpl implements CustomerMappingService {

    @Override
    public Customer mapDtoToEntity(CustomerDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setName( dto.getName() );

        customer.setActive( true );

        return customer;
    }

    @Override
    public CustomerDTO mapEntityToDto(Customer entity) {
        if ( entity == null ) {
            return null;
        }

        CustomerDTO customerDTO = new CustomerDTO();

        customerDTO.setId( entity.getId() );
        customerDTO.setName( entity.getName() );

        return customerDTO;
    }
}
