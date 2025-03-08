package com.fincaFacil.inventory.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;


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
  @ManyToMany(mappedBy = "categories")
  private Set<ProductEntity> products;

  public CategoryEntity (String name, String description, boolean dFault) {
    this.name = name;
    this.description = description;
    this.dFault = dFault;
  }
}
