package com.msa.inventory.repository;

import com.msa.inventory.entitie.WareHouse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WareHouseRepo extends JpaRepository<WareHouse, Long> {
}
