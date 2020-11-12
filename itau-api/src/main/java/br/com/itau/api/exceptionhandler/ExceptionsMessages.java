package br.com.itau.api.exceptionhandler;

import java.time.LocalDateTime;


import org.springframework.validation.FieldError;



public class ExceptionsMessages {
	
	private Integer status;
	
	private LocalDateTime dataHora;
	
	private String titulo;
	
	private FieldError causa;
	
	
// Get and Set
	
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public FieldError getCausa() {
		return causa;
	}

	public void setCausa(FieldError fieldError) {
		this.causa = fieldError;
	}

	

	

	



	
	

	
	
	
	

}
