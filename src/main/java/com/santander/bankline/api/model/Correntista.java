package com.santander.bankline.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Correntista {
  private Integer id;
  private String cpf;
  private String nome;

  private Conta conta;
}
