package com.fincaFacil.inventory.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WareHouseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String address;
  @OneToMany(mappedBy = "warehouse", cascade = CascadeType.ALL)
  private List<InventoryItemEntity> inventoryItems;
}
