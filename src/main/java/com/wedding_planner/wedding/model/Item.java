package com.wedding_planner.wedding.model;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "items")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Item {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private String price;
    
    @Column(nullable = false)
    private String status;

    // Default Constructor
    public Item() {}
    
    // All-args Constructor  
    public Item(String name, String price, String status) {
        this.name = name;
        this.price = price;
        this.status = status;
    }

    // ✅ GETTERS (return type Long/String)
    public Long getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getPrice() {
        return price;
    }
    
    public String getStatus() {
        return status;
    }

    // ✅ SETTERS (return type void)
    public void setId(Long id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPrice(String price) {
        this.price = price;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}
