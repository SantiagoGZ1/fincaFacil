package com.msa.inventory.repository;
import com.msa.inventory.entitie.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Long> {
  List<Product> findByCategory_Name(String name);
}
