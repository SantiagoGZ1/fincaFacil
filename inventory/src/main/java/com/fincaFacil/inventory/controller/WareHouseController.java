package com.fincaFacil.inventory.controller;

import com.fincaFacil.inventory.entity.WareHouseEntity;
import com.fincaFacil.inventory.service.WareHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("wareHouse")
public class WareHouseController {

  @Autowired
  private WareHouseService wareHouseService;

  @PostMapping("/new")
  public ResponseEntity<?> createWareHouse(@RequestBody WareHouseEntity wareHouseEntity){
    return wareHouseService.savedWareHouse(wareHouseEntity);
  }

  @GetMapping("/{id}")
  public ResponseEntity<?> getWareHouseById(@PathVariable Long id){
    return ResponseEntity.ok(wareHouseService.getWareHouseById(id));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<?> deleteWareHouseById(@PathVariable Long id){
    return wareHouseService.deleteWareHouseById(id);
  }
}
