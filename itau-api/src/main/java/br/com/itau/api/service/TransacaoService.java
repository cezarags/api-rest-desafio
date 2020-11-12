package br.com.itau.api.service;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import br.com.itau.api.model.Transacao;



@Service
public class TransacaoService {
	
	
	public List<Transacao> repository = new ArrayList<Transacao>();
	
	
	public ResponseEntity<Transacao> salvar(@Valid Transacao transacao){
		if(transacao.getValor() > 0 && transacao.getDataOperacao().isBefore(LocalDateTime.now())) {
		repository.add(transacao);
		return ResponseEntity.status(HttpStatus.CREATED).body(transacao);
		
		}
		return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).build();
	}
	
	
	
	public void deletar(){
		 repository.removeAll(repository);
		  	
	}
		
	
	@GetMapping("/estatisticas")
	public DoubleSummaryStatistics get(){
		DoubleSummaryStatistics dados = new DoubleSummaryStatistics();
		
		repository.stream().filter(resp -> resp.getDataOperacao().isAfter(LocalDateTime.now().minusMinutes(1)))
			.forEach(resp -> dados.accept(resp.getValor()));
			
		return dados;
		}
		
		
	
		
		
	}
		
		
		
	
	



