package com.fincaFacil.inventory.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "categories")
public class CategoryEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(nullable = false, unique = true)
  private String name;
  private String description;
  @Column(nullable = false)
  private Boolean dFault = false;

  public CategoryEntity (String name, String description, boolean dFault) {
    this.name = name;
    this.description = description;
    this.dFault = dFault;
  }
}
