package com.fincaFacil.inventory.repository;

import com.fincaFacil.inventory.model.WeightTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeightTypeRepo extends JpaRepository<WeightTypeEntity, Long> {
}
