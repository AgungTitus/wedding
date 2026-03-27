package com.wedding_planner.wedding.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class ItemRequestDto {
    @NotBlank(message = "Nama tidak boleh kosong")
    private String name;
    
    @NotBlank(message = "Harga wajib")
    @Pattern(regexp = "^\\d+$", message = "Harga harus angka")
    private String price;
    
    @NotBlank(message = "Status wajib")
    @Pattern(regexp = "(DONE|IN_PROGRESS|PENDING)", message = "Status salah")
    private String status;

    // Constructors, getters, setters
    public ItemRequestDto() {}
    
    public ItemRequestDto(String name, String price, String status) {
        this.name = name;
        this.price = price;
        this.status = status;
    }
    
    // getters/setters...
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getPrice() { return price; }
    public void setPrice(String price) { this.price = price; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
