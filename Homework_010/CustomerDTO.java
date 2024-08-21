package de.ait_tr.shop.model.dto;

import de.ait_tr.shop.model.entity.Cart;
import jakarta.persistence.*;

import java.util.Objects;


public class CustomerDTO {


    private Long id;

    private String name;

                                        // при сохранении customer
                                        // сохраняется его cart
    @OneToOne(mappedBy = "customer", cascade = CascadeType.PERSIST)
    private Cart cart;

    @Override
    public String toString() {
        return String.format("Customer: id -%d, name - %s, active - %s",
                id, name);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerDTO that)) return false;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(cart, that.cart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, cart);
    }
}
