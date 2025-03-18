package com.fincaFacil.inventory.service;

import com.fincaFacil.inventory.model.WeightTypeEntity;
import com.fincaFacil.inventory.repository.WeightTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class WeightTypeService {

  @Autowired
  private WeightTypeRepo weightTypeRepo;

  public ResponseEntity<?> saveWeightType(WeightTypeEntity weightTypeEntity) {
    return ResponseEntity.ok("WeightType has been saved" + weightTypeEntity);
  }
  public WeightTypeEntity getWeightTypeById(Long id) {
    return weightTypeRepo.findById(id).orElseThrow();
  }

  public ResponseEntity<String> deleteWeightTypeById(Long id){
    return ResponseEntity.ok("Product with id: " + id + " has been deleted");
  }
}
