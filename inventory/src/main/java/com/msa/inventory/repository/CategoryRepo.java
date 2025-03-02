package com.msa.inventory.repository;

import com.msa.inventory.entitie.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}
