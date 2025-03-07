package com.fincaFacil.inventory.repository;

import com.fincaFacil.inventory.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<CategoryEntity, Long> {
}
