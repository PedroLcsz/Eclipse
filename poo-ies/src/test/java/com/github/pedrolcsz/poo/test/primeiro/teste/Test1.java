package com.github.pedrolcsz.poo.test.primeiro.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test1{

	@Test
	public void testInteiro() throws Exception {
		Object contador = 1;
		assertEquals(1, contador); //assertEquals : Verifica se tem mesmo valor

	}
	@Test
	public void testString() throws Exception {
		Object meuNome = "Pedro Lucas";
		
		System.out.println(meuNome);
		assertEquals("Pedro Lucas", meuNome);
		
	}

}
