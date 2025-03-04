package com.msa.sales.repository;

import com.msa.sales.entities.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepo extends JpaRepository<Sales, Long> {
}
