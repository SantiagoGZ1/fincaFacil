package com.msa.inventory.controller;

import com.msa.inventory.entitie.Category;
import com.msa.inventory.entitie.WareHouse;
import com.msa.inventory.service.WareHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/warehouse")
public class WareHouseController {

  @Autowired
  private WareHouseService wareHouseService;

  @PostMapping("/new")
  public ResponseEntity<?> createWareHouse(@RequestBody WareHouse wareHouse) {
    WareHouse savedWareHouse = wareHouseService.saveWareHouse(wareHouse);
    return ResponseEntity.ok().body("successfully created ware house" + savedWareHouse);
  }

  @GetMapping("/{id}")
  public ResponseEntity<?> getWareHouseById(@PathVariable Long id) {
    WareHouse wareHouse = wareHouseService.getWareHouseById(id);
    return ResponseEntity.ok().body(wareHouse);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<?> deleteWareHouseById(@PathVariable Long id) {
    return wareHouseService.deleteWareHouseById(id);
  }

}
