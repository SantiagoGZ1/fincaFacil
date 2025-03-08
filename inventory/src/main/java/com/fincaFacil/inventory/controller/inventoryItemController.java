package com.fincaFacil.inventory.controller;

import com.fincaFacil.inventory.entity.CategoryEntity;
import com.fincaFacil.inventory.entity.InventoryItemEntity;
import com.fincaFacil.inventory.service.InventoryItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventoryItem")
public class inventoryItemController {

  @Autowired
  private InventoryItemService inventoryItemService;

  @PostMapping("/new")
  public ResponseEntity<?> createInventoryItem(@RequestBody InventoryItemEntity inventoryItem) {
    return inventoryItemService.savedInventoryItem(inventoryItem);
  }

  @GetMapping("/{id}")
  public ResponseEntity<?> getInventoryItemById(@PathVariable Long id){
    return ResponseEntity.ok(inventoryItemService.getInventoryItemServiceById(id));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<?> deleteInventoryItemById(@PathVariable Long id){
    return inventoryItemService.deleteInventoryItemServiceById(id);
  }
}
