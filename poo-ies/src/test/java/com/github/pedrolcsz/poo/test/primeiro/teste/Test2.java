package com.github.pedrolcsz.poo.test.primeiro.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test2 {

	@Test
	public void inteiro() throws Exception {
		int idadeMaria = 15;
		assertEquals(15 ,idadeMaria);
	}
	
	@Test
	public void string() throws Exception {
		String name = "Eduardo";
		assertEquals("João", name);
	}
	@Test
	public void charVar() throws Exception {
		char letra = 's';
		assertEquals('n', letra);	
	}
}
