package com.msa.inventory.service;

import com.msa.inventory.entitie.Product;
import com.msa.inventory.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
  @Autowired
  private ProductRepo productRepo;

  public Product saveProduct(Product product) {
    return productRepo.save(product);
  }

  public Product getProductById(Long id) {
    return productRepo.findById(id).orElse(null);
  }

  //TODO implementar el metodo de obtener todos los productos por usario

  public List<Product> getProductsByCategoryName(String category) {
    return productRepo.findByCategory_Name(category);
  }

}
