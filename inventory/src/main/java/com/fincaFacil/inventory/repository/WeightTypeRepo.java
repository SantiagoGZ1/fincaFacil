package com.fincaFacil.inventory.repository;

import com.fincaFacil.inventory.entity.WareHouseEntity;
import com.fincaFacil.inventory.entity.WeightTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeightTypeRepo extends JpaRepository<WeightTypeEntity, Long> {
}
