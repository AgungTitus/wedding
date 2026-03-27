package com.wedding_planner.wedding.dto;

public class ItemResponseDto {
    private Long id;
    private String name;
    private String price;
    private String status;
    
    // ✅ FULL CONSTRUCTOR (semua field)
    public ItemResponseDto(Long id, String name, String price, String status) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.status = status;
    }
    
    // ✅ NO-ARG CONSTRUCTOR (Jackson butuh)
    public ItemResponseDto() {}
    
    // ✅ GETTERS (semua wajib!)
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
    
    // ✅ SETTERS (optional tapi lengkap)
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
