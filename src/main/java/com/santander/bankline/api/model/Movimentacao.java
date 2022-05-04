package com.santander.bankline.api.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movimentacao {
  private Integer id;
  private LocalDateTime dataHora;
  private String decricao;
  private Double valor;
  private MovimentacaoTipo tipo; 
}
