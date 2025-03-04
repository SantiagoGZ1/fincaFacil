package com.msa.inventory.service;

import com.msa.inventory.entitie.Category;
import com.msa.inventory.repository.CategoryRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
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

  public void defaultCategoryInitialization() {
    List<Category> defaultCategories = new ArrayList<>();
    defaultCategories.add(new Category("Dairy", "Milk derivatives", true));
    defaultCategories.add(new Category("Meat", "Animals meat products", true));
    defaultCategories.add(new Category("Fruits", "Fruits", true));
    defaultCategories.add(new Category("Vegetables", "Vegetables", true));
    for (Category category : defaultCategories){ // for each: Se usa si solo quiero leer elementos de una lista
      if(!categoryRepo.existsByName(category.getName())){
        categoryRepo.save(category);
      }
    }
  }
}
