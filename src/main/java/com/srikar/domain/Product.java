package com.srikar.domain;

import java.io.Serializable;

/**
 * Created by vedantas on 1/29/2018.
 */
public class Product implements Serializable {

    private static final long serialVersionUID = 1579L;

    private String name;
    private String description;
    private float price;

    public Product(String name, String description, float price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Product(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
