package com.santander.bankline.api.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Conta {
  @Column(name = "conta_numero")
  private Long numero;
  @Column(name = "conta_saldo")
  private Double saldo;
}
