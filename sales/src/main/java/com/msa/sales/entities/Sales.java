package com.msa.sales.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@AllArgsConstructor
@Table(name = "sales")
public class Sales {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  //una venta necesita productos

}