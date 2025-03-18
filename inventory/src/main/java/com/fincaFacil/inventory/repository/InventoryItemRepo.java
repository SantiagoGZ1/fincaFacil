package com.fincaFacil.inventory.repository;

import com.fincaFacil.inventory.model.InventoryItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryItemRepo extends JpaRepository<InventoryItemEntity, Long> {
}
