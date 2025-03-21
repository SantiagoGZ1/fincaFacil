package com.fincaFacil.inventory.service;

import com.fincaFacil.inventory.model.ProductEntity;
import com.fincaFacil.inventory.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
  @Autowired
  private ProductRepo productRepo;

  public ResponseEntity<?> saveProduct(ProductEntity product) {
    return ResponseEntity.ok("Product has been saved" + product);
  }

  public ProductEntity getProductById(Long id) {
    return productRepo.findById(id).orElseThrow();
  }

  //TODO implementar el metodo de obtener todos los productos por usario

  public ResponseEntity<String> deleteProductById(Long id) {
    if (!productRepo.existsById(id)) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product with id: " + id + " not found");
    }
    productRepo.deleteById(id);
    return ResponseEntity.ok("Product with id: " + id + " has been deleted");
  }
  public ResponseEntity<?> updateProduct (Long id){
    return null;
  }
}
