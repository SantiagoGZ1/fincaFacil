package com.fincaFacil.inventory.service;

import com.fincaFacil.inventory.model.CategoryEntity;
import com.fincaFacil.inventory.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {
  @Autowired
  private CategoryRepo categoryRepo;

  public ResponseEntity<?> savedCategory(CategoryEntity categoryEntity){
    return ResponseEntity.ok("Cateogry has been saved" + categoryEntity);
  }

  public CategoryEntity getCategoryById(Long id) {
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

  public void defaultCategoryInitialization() {
    List<CategoryEntity> defaultCategories = new ArrayList<>();
    defaultCategories.add(new CategoryEntity("Dairy", "Milk derivatives", true));
    defaultCategories.add(new CategoryEntity("Meat", "Animals meat products", true));
    defaultCategories.add(new CategoryEntity("Fruits", "Fruits", true));
    defaultCategories.add(new CategoryEntity("Vegetables", "Vegetables", true));
    for (CategoryEntity category : defaultCategories){ // for each: Se usa si solo quiero leer elementos de una lista
      if(!categoryRepo.existsByName(category.getName())){
        categoryRepo.save(category);
      }
    }
  }
}
