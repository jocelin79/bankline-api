package com.santander.bankline.api.controller;

import java.util.List;

import com.santander.bankline.api.dto.NovaMovimentacao;
import com.santander.bankline.api.model.Movimentacao;
import com.santander.bankline.api.repository.MovimentacaoRepository;
import com.santander.bankline.api.service.MovimentacaoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {
  @Autowired
  private MovimentacaoRepository repository;

  @Autowired
  private MovimentacaoService service;

  @GetMapping
  public List<Movimentacao> findAll(){
    return repository.findAll();
  };

  @GetMapping("/{idConta}")
	public List<Movimentacao> findAll(@PathVariable("idConta") Integer idConta){
		return repository.findByIdConta(idConta);
	}

  @PostMapping
  public void save(@RequestBody NovaMovimentacao movimentacao){
    service.save(movimentacao);
  };
}
