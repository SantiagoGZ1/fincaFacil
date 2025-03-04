package com.msa.inventory.repository;

import com.msa.inventory.entitie.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepo extends JpaRepository<Category, Long> {
  boolean existsByName(String name);
  Optional<Category> findByName(String name);
}
