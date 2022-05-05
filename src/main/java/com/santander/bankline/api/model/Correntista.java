package com.santander.bankline.api.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tab_correntista")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Correntista {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(length = 20)
  private String cpf;
  @Column(length = 60)
  private String nome;

  @Embedded
  private Conta conta;

  @Column(name = "id_conta")
  private Integer idConta; 
}
