package com.fincaFacil.inventory.service;

import com.fincaFacil.inventory.entity.WareHouseEntity;
import com.fincaFacil.inventory.repository.WareHouseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class WareHouseService {

  @Autowired
  private WareHouseRepo wareHouseRepo;

  public ResponseEntity<?> savedWareHouse(WareHouseEntity wareHouseEntity){
    return ResponseEntity.ok("WareHouse has been saved" + wareHouseEntity);
  }

  public WareHouseEntity getWareHouseById(Long id){
    return wareHouseRepo.findById(id).orElseThrow();
  }

  public ResponseEntity<?> deleteWareHouseById(Long id){
    if(!wareHouseRepo.existsById(id)){
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("WareHose with id: " + id + " not found");
    }
    wareHouseRepo.deleteById(id);
    return ResponseEntity.ok("WareHouse with id: " + id + " has been deleted");
  }

}
