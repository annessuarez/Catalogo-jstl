package org.cuatrovientos.product;

import java.math.BigDecimal;

public class Product {

    private long id;
    private String name;
    private BigDecimal price;

    
    // Declarar las variables
    public Product(long id, String name, BigDecimal price) { 
        this.id = id;
        this.name = name;
        this.price = price;
    } 
  
    public long getId() { 
        return id; 
    } 
  
    public String getName() { 
        return name; 
    } 
  
    public BigDecimal getPrice() { 
        return price; 
    } 
}
