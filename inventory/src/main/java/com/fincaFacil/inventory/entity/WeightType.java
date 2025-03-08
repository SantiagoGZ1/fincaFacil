package com.fincaFacil.inventory.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "weight_type")
public class WeightType {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String abbreviation; // Ej: "kg", "lb", "g"
  @OneToMany(mappedBy = "weightType", cascade = CascadeType.ALL)
  private Set<ProductEntity> productEntity;
}
