package com.msa.inventory.controller;

import com.msa.inventory.entitie.Category;
import com.msa.inventory.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CategoryController {

  @Autowired
  private CategoryService categoryService;

  @PostMapping("/new")
  public ResponseEntity<?> createCategory(@RequestBody Category category) {
    Category savedCategory = categoryService.saveCategory(category);
    return ResponseEntity.ok().body("successfully created category" + savedCategory);
  }

  @GetMapping("/{id}")
  public ResponseEntity<?> getCategoryById(@PathVariable Long id) {
    Category product = categoryService.getCategoryById(id);
    return ResponseEntity.ok().body(product);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<?> deleteCategoryById(@PathVariable Long id) {
    return categoryService.deleteCategoryById(id);
  }
}
