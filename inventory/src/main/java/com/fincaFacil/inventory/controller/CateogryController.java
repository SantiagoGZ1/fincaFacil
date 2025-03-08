package com.fincaFacil.inventory.controller;

import com.fincaFacil.inventory.entity.CategoryEntity;
import com.fincaFacil.inventory.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CateogryController {

  @Autowired
  private CategoryService categoryService;

  @PostMapping("/new")
  public ResponseEntity<?> createCategory(@RequestBody CategoryEntity categoryEntity) {
    return categoryService.savedCategory(categoryEntity);
  }

  @GetMapping("/{id}")
  public ResponseEntity<?> getCategoryById(@PathVariable Long id) {
    return ResponseEntity.ok(categoryService.getCategoryById(id));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<?> deleteCategoryById(@PathVariable Long id) {
    return categoryService.deleteCategoryById(id);
  }
}
