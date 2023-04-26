package com.codecademy.coffeeorders.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class CoffeeOrder {
    @Id
    @GeneratedValue
    private Long id;

    private String blend;
    private DrinkSize size;

    private String customer;
    private Boolean fulfilled;

    @PostLoad
    public void postLoad() {

    }

    @PostPersist
    public void postPersist() {

    }

    @PostRemove
    public void postRemove() {

    }
}
