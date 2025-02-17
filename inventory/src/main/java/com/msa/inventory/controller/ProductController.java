package com.msa.inventory.controller;

import com.msa.inventory.entitie.Product;
import com.msa.inventory.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {
  private ProductService productService;

  @PostMapping("/new")
  public ResponseEntity<?> createProduct(@RequestBody Product product) {
    //se guarda el producto creado en la base de datos y savedProductt
    Product savedProduct = productService.saveProduct(product);
    return ResponseEntity.ok().body("successfully created product" + savedProduct);
  }

  @GetMapping("/{id}")
  public ResponseEntity<?> getProductById(@PathVariable Long id) {
    Product product = productService.getProductById(id);
    return ResponseEntity.ok().body(product);
  }

  @GetMapping("/category/{categoryName}")
  public List<Product> getProductByCategoryName(@PathVariable String categoryName) {
    return productService.getProductsByCategoryName(categoryName);
  }

}
