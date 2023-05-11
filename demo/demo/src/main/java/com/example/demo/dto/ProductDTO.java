package com.example.demo.dto;

import java.math.BigDecimal;

public class ProductDTO {
    private long id;
    private String name;
    private String description;
    private BigDecimal price;
    private String item_code;

    public String getItem_code() {
        return item_code;
    }

    public void setItem_code(String item_code) {
        this.item_code = item_code;
    }

    public ProductDTO(long id, String name, String description, BigDecimal price ,String item_code) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.item_code = item_code;
    }

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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
