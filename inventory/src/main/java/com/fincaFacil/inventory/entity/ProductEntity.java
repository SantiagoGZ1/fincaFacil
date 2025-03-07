package com.fincaFacil.inventory.entity;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class ProductEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String details;
  private Double price;
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "category_id")
  private CategoryEntity category;
  private Long weightTypeId;

  @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
  private List<InventoryItemEntity> inventoryItems;
}
