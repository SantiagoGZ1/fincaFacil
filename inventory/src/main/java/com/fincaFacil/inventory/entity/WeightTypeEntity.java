package com.fincaFacil.inventory.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "weight_type")
public class WeightTypeEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String abbreviation; // Ej: "kg", "lb", "g"
  @OneToMany(mappedBy = "weightTypeEntity", cascade = CascadeType.ALL)
  private Set<ProductEntity> productEntity;
}
