package com.fincaFacil.inventory.repository;

import com.fincaFacil.inventory.model.WareHouseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WareHouseRepo extends JpaRepository<WareHouseEntity, Long> {
}
