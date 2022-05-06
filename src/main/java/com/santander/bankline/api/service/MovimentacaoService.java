package com.santander.bankline.api.service;

import java.time.LocalDateTime;

import com.santander.bankline.api.dto.NovaMovimentacao;
import com.santander.bankline.api.model.Correntista;
import com.santander.bankline.api.model.Movimentacao;
import com.santander.bankline.api.model.MovimentacaoTipo;
import com.santander.bankline.api.repository.CorrentistaRepository;
import com.santander.bankline.api.repository.MovimentacaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovimentacaoService {

  @Autowired
  private MovimentacaoRepository repository;

  @Autowired
  private CorrentistaRepository correntistaRepository;

  public void save(NovaMovimentacao novaMovimentacao) {
    Movimentacao movimentacao = new Movimentacao();

    Double valor = novaMovimentacao.getValor();
		if(novaMovimentacao.getTipo() == MovimentacaoTipo.DESPESA)
			valor = valor * -1;

    movimentacao.setDataHora(LocalDateTime.now());
    movimentacao.setDescricao(novaMovimentacao.getDescricao());
    movimentacao.setIdConta(novaMovimentacao.getIdConta());
    movimentacao.setTipo(novaMovimentacao.getTipo());
    movimentacao.setValor(valor);

    Correntista correntista = correntistaRepository.findById(novaMovimentacao.getIdConta()).orElse(null);
		if(correntista != null) {
			correntista.getConta().setSaldo(correntista.getConta().getSaldo() + valor);
			correntistaRepository.save(correntista);
		}

    repository.save(movimentacao);
  }
}
