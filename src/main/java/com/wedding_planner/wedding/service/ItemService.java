package com.wedding_planner.wedding.service;

import com.wedding_planner.wedding.model.Item;
import com.wedding_planner.wedding.repository.ItemRepository; 
import com.wedding_planner.wedding.dto.ItemRequestDto;
import com.wedding_planner.wedding.dto.ItemResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemService {
    
    @Autowired
    private ItemRepository itemRepository;
    
    // CREATE
    public ItemResponseDto createItem(ItemRequestDto dto) {
        Item item = new Item(dto.getName(), dto.getPrice(), dto.getStatus());
        Item saved = itemRepository.save(item);
        return new ItemResponseDto(saved.getId(), saved.getName(), saved.getPrice(), saved.getStatus());
    }
    
    // READ ALL
    public List<ItemResponseDto> getAllItems() {
        return itemRepository.findAll().stream()
            .map(item -> new ItemResponseDto(item.getId(), item.getName(), item.getPrice(), item.getStatus()))
            .collect(Collectors.toList());
    }
    
    // READ BY ID
    public ItemResponseDto getItemById(Long id) {
        Item item = itemRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Item not found: " + id));
        return new ItemResponseDto(item.getId(), item.getName(), item.getPrice(), item.getStatus());
    }
    
    // UPDATE
    public ItemResponseDto updateItem(Long id, ItemRequestDto dto) {
        Item item = itemRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Item not found: " + id));
        item.setName(dto.getName());
        item.setPrice(dto.getPrice());
        item.setStatus(dto.getStatus());
        Item updated = itemRepository.save(item);
        return new ItemResponseDto(updated.getId(), updated.getName(), updated.getPrice(), updated.getStatus());
    }
    
    // DELETE
    public void deleteItem(Long id) {
        if (!itemRepository.existsById(id)) {
            throw new RuntimeException("Item not found: " + id);
        }
        itemRepository.deleteById(id);
    }
}
