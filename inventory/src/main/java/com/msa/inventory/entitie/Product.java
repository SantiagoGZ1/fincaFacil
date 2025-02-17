package com.msa.inventory.entitie;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
@Entity
@AllArgsConstructor
@Table(name = "products")
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String details;
  private LocalDate harvestDate; //fecha de cosecha
  @ManyToOne
  @JoinColumn(name = "category_id", nullable = false)
  private Category category;
  private Double price;
  private WeightType weightType;
}
