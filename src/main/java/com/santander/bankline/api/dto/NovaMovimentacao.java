package com.santander.bankline.api.dto;

import com.santander.bankline.api.model.MovimentacaoTipo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NovaMovimentacao {
  private String descricao;
  private Double valor;
  private MovimentacaoTipo tipo;
  private Integer idConta;
}
