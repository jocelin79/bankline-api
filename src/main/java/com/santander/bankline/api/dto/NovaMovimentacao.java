package com.santander.bankline.api.dto;

import com.santander.bankline.api.model.MovimentacaoTipo;

import lombok.Data;

@Data
public class NovaMovimentacao {
  private String descricao;
  private Double valor;
  private MovimentacaoTipo tipo;
  private Integer idConta;
}
