package com.msa.inventory.implementations;
import com.msa.inventory.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

//Ejecuta automaticamente al iniciar la app
public class DataInitializer implements CommandLineRunner {
  private final CategoryService categoryService;

  @Autowired
  public  DataInitializer(CategoryService categoryService){
    this.categoryService= categoryService;
  }

  @Override
  public void run(String... args) throws Exception {
    categoryService.defaultCategoryInitialization();
  }
}
