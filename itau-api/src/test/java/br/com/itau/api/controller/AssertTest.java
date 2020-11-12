package br.com.itau.api.controller;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class AssertTest {

	@Test   //verifico se o object retornado não está nulo.
	public void testAssertNotNull() {
		assertNotNull(new Object());
	}
	
	@Test // verifica se o object está null em determinado momento.
	public void testAssertNull() {
		assertNull(null);
	}
	
	@Test	// verifico se o object retornado não é falso.
	public void testAssertFalse() {
		assertFalse(false);
		
	}
	
	@Test // verifico se o objects não são os mesmos.
	public void testAssertNotSame() {
		assertNotSame(new Object(), new Object());
	}
	
	
	
	
	
}