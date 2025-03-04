package com.msa.inventory.entitie;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "categories")
public class Category {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(nullable = false, unique = true)
  private String name;
  private String description;
  @Column(nullable = false)
  private boolean dFault = false;

  public Category(String name, String description, boolean dFault) {
    this.name = name;
    this.description = description;
    this.dFault = dFault;
  }

}