package de.ait_tr.shop.service.mapping;

import de.ait_tr.shop.model.dto.CustomerDTO;
import de.ait_tr.shop.model.dto.ProductDTO;
import de.ait_tr.shop.model.entity.Customer;
import de.ait_tr.shop.model.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMappingService {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "active", constant = "true")
    public Customer mapDtoToEntity(CustomerDTO dto);

    public CustomerDTO mapEntityToDto(Customer entity);


}
