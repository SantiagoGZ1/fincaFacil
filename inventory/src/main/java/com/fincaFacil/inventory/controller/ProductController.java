package com.fincaFacil.inventory.controller;

import com.fincaFacil.inventory.entity.ProductEntity;
import com.fincaFacil.inventory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

  @Autowired
  private ProductService productService;

  @PostMapping("/new")
  public ResponseEntity<?> createProduct(@RequestBody ProductEntity product) {
    //se guarda el producto creado en la base de datos y savedProductt
    ProductEntity savedProduct = productService.saveProduct(product);
    return ResponseEntity.ok().body("successfully created product" + savedProduct);
  }

  @GetMapping("/{id}")
  public ResponseEntity<?> getProductById(@PathVariable Long id) {
    ProductEntity product = productService.getProductById(id);
    return ResponseEntity.ok().body(product);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<?> deleteProductById(@PathVariable Long id) {
    return productService.deleteProductById(id);
  }
}
