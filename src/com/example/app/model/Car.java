package com.example.app.model;

import java.io.Serializable;

//@Entity
public class Car implements Serializable {
    //@Id
    private Long id;
    private String name;
    private float price;

    public Car() {
    }

    public Car(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
