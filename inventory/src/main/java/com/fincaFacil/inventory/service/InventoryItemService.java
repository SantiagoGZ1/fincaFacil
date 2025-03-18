package com.fincaFacil.inventory.service;

import com.fincaFacil.inventory.model.InventoryItemEntity;
import com.fincaFacil.inventory.repository.InventoryItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class InventoryItemService {
  @Autowired
  private InventoryItemRepo inventoryItemRepo;

  public ResponseEntity<?> savedInventoryItem(InventoryItemEntity inventoryItem){
    return ResponseEntity.ok("Inventory Item has been saved" + inventoryItem);
  }

  public InventoryItemEntity getInventoryItemServiceById(Long id){
    return inventoryItemRepo.findById(id).orElseThrow();
  }

  public ResponseEntity<?> deleteInventoryItemServiceById(Long id){
    if(!inventoryItemRepo.existsById(id)){
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Inventory Item with id: " + id + " not found");
    }
    inventoryItemRepo.deleteById(id);
    return ResponseEntity.ok("InventoryItem with id: " + id + " has been deleted");
  }
}
