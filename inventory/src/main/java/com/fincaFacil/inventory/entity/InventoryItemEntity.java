// represente el inventario de un producto específico en una bodega específica. La razón es que un mismo producto puede estar en varias bodegas con diferentes cantidades, y una bodega tendrá múltiples productos.

/*Muchos elementos de inventario (InventoryItemEntity) pueden estar asociados a un mismo producto.
    Por ejemplo: El producto "Manzana" puede estar en la bodega A con 100 unidades y en la bodega B con 50 unidades. Esto genera dos registros de InventoryItemEntity que apuntan al mismo producto.
    La columna product_id en la tabla inventory_items guardará la referencia (clave foránea) al ID del producto.*/

/*Muchos elementos de inventario (InventoryItemEntity) pueden estar asociados a una misma bodega.
    Por ejemplo: En la bodega "Central" pueden existir 500 productos diferentes, cada uno con su cantidad específica. Esto genera 500 registros de InventoryItemEntity que apuntan a la misma bodega.
    La columna warehouse_id en la tabla inventory_items guardará la referencia (clave foránea) al ID de la bodega.*/

package com.fincaFacil.inventory.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "inventory_items")
public class InventoryItemEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  //Que producto tengo
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "product_id")
  private ProductEntity product;

  //En que bodega está
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "warehouse_id")
  private WareHouseEntity warehouse;

  private Integer quantity;

  // Puedes agregar otros campos útiles para inventario
  private Integer minimumStock;
  private Integer maximumStock;
  private String location; // ubicación dentro de la bodega (pasillo, estante, etc.)

}
