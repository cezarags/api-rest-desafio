package br.com.itau.api.exceptionhandler;

import java.time.LocalDateTime;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;



@ControllerAdvice
public class ApiExceptionHandler extends  ResponseEntityExceptionHandler {
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		
		var messageEx = new ExceptionsMessages();
		messageEx.setStatus(status.value());
		messageEx.setDataHora(LocalDateTime.now());
		messageEx.setTitulo("Um ou mais campos estão invalidos.");
		messageEx.setCausa(ex.getBindingResult().getFieldError());
		
		
		return super.handleExceptionInternal(ex, messageEx, headers, status, request);
	}

}
