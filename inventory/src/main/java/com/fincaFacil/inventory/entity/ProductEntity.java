package com.fincaFacil.inventory.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

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

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(
      name = "product_category",
      joinColumns = @JoinColumn(name = "product_id"),
      inverseJoinColumns = @JoinColumn(name = "category_id")
  )
  private Set<CategoryEntity> categories;
/*  @JoinTable: Define la tabla intermedia que almacena las relaciones:
 name: Nombre de la tabla intermedia
  joinColumns: Columna que hace referencia a la entidad actual (producto)
  inverseJoinColumns: Columna que hace referencia a la entidad relacionada (categoría)
Use Set<> en lugar de List<> para las colecciones porque es más eficiente en relaciones muchos a muchos, ya que evita duplicados.*/
  private Double weight;
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "weight_type_id")
  private WeightTypeEntity weightTypeEntity;

  @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
  private List<InventoryItemEntity> inventoryItems;
}
