package com.msa.inventory.service;

import com.msa.inventory.entitie.WareHouse;
import com.msa.inventory.repository.WareHouseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class WareHouseService {

  @Autowired
  private WareHouseRepo wareHouseRepo;

  public WareHouse saveWareHouse(WareHouse category) {
    return wareHouseRepo.save(category);
  }

  public WareHouse getWareHouseById(Long id) {
    return wareHouseRepo.findById(id).orElse(null);
  }

  //TODO implementar el metodo de obtener todos las categorias por usario

  public ResponseEntity<String> deleteWareHouseById(Long id){
    if (!wareHouseRepo.existsById(id)){
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ware House with id: " + id + " not found");
    }
    wareHouseRepo.deleteById(id);
    return ResponseEntity.ok("Ware House with id: " + id + " has been deleted");
  }
}
