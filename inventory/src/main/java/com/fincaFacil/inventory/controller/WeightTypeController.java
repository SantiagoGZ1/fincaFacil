package com.fincaFacil.inventory.controller;

import com.fincaFacil.inventory.entity.WeightTypeEntity;
import com.fincaFacil.inventory.service.WeightTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weightType")
public class WeightTypeController {
  @Autowired
  private WeightTypeService weightTypeService;

  @PostMapping("/new")
  public ResponseEntity<?> createWeightType(@RequestBody WeightTypeEntity weightTypeEntity) {
    return weightTypeService.saveWeightType(weightTypeEntity);
  }

  @GetMapping("/{id}")
  public ResponseEntity<?> getWeightTypeById(@PathVariable Long id) {
    return ResponseEntity.ok(weightTypeService.getWeightTypeById(id));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<?> deleteWeightTypeById(@PathVariable Long id) {
    return weightTypeService.deleteWeightTypeById(id);
  }
}
