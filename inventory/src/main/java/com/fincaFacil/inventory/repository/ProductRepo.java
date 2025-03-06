package com.fincaFacil.inventory.repository;

import com.fincaFacil.inventory.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository <ProductEntity, Long> {
}
