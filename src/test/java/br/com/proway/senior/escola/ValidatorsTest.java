package br.com.proway.senior.escola;

import static org.junit.Assert.*;

import org.junit.Test;

import Tools.Validators;

public class ValidatorsTest {

	@Test
	public void testNomeSemNumeros() {
		assertTrue(Validators.onlyValidChars("Jose"));
	}

	@Test
	public void testNomeComNumeros() {
		assertFalse(Validators.onlyValidChars("MarquinhosGameplay123"));
	}
	
	@Test
	public void testNomeCaracteresEspeciais() {
		assertFalse(Validators.onlyValidChars("RicardoProgGamer20!!!"));
	}
}
