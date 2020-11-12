package br.com.itau.api.controller;


import java.util.DoubleSummaryStatistics;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.com.itau.api.model.Transacao;
import br.com.itau.api.service.TransacaoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping(value="/transacoes")
@CrossOrigin(origins = "*", allowedHeaders = "*")   //liberado o acesso para comunicação com outras aplicaçoes
@Api(value="API Rest de transfêrencia")
public class TransacaoController {
	
	@Autowired
	TransacaoService transacaoService;
	
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/transferir")
	@ApiOperation(value="Endpoint registra uma transferencia, recebendo um valor,data e horário.s")
	public ResponseEntity<Transacao> transferir(@Validated @Valid @RequestBody Transacao transacao){
		return  transacaoService.salvar(transacao);
	}
	@DeleteMapping("/deletar")
	@ApiOperation(value="Endpoint deleta todos os dados de transferencias realizadas.")
	public void delete(){
		transacaoService.deletar();			
	}
	
	
	@GetMapping("/estatisticas")
	@ApiOperation(value="Endpoint retorna estatísticas das transações que aconteceram apenas nos ultimos 60 segundos.")
	public ResponseEntity<DoubleSummaryStatistics> get(){
		return ResponseEntity.status(HttpStatus.OK).body(transacaoService.get());
		}
	
}