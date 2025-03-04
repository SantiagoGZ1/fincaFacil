package com.msa.inventory.entitie;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String details;
  @Column(name = "harvest_date")
  private LocalDate harvestDate; //fecha de cosecha
  @ManyToOne
  @JoinColumn(name = "category_id", nullable = false)
  private Category category;
  private Double price;
  @Column(name = "weight:type")
  private WeightType weightType;
}
