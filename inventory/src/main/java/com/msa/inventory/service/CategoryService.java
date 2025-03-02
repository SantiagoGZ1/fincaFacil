package com.msa.inventory.service;

import com.msa.inventory.entitie.Category;
import com.msa.inventory.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

  @Autowired
  private CategoryRepo categoryRepo;

  public Category saveCategory(Category category) {
    return categoryRepo.save(category);
  }

  public Category getCategoryById(Long id) {
    return categoryRepo.findById(id).orElse(null);
  }

  //TODO implementar el metodo de obtener todos las categorias por usario

  public ResponseEntity<String> deleteCategoryById(Long id){
    if (!categoryRepo.existsById(id)){
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Category with id: " + id + " not found");
    }
    categoryRepo.deleteById(id);
    return ResponseEntity.ok("Category with id: " + id + " has been deleted");
  }
}
