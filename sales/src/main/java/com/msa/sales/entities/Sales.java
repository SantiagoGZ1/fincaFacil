package com.msa.sales.entities;
import jakarta.persistence.*;
import jakarta.ws.rs.client.Client;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@Entity
@AllArgsConstructor
@Table(name = "sales")
public class Sales {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
   Double totalPrice;
   LocalDateTime date;
  //TODO: Add client y list product


}