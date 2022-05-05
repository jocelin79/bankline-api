package com.santander.bankline.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NovoCorrentista {
  private String nome;
  private String cpf;
}
