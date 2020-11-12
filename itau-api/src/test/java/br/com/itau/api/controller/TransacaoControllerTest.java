package br.com.itau.api.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.itau.api.model.Transacao;
import br.com.itau.api.service.TransacaoService;

class TransacaoControllerTest {
	
	@Autowired
	TransacaoService ts = new TransacaoService();
	
	

	@Test
	void testTransferir() {
		Transacao transTest = new Transacao();
		
		transTest.setValor(400.00);
		transTest.setDataOperacao(LocalDateTime.now());
	}
	
	
		
		
		
	}
	
	
	


