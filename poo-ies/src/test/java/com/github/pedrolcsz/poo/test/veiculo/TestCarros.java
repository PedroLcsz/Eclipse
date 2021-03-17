package com.github.pedrolcsz.poo.test.veiculo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.pedrolcsz.poo.veiculo.Carro;

public class TestCarros {
	
	@Test
	public void testCarro() throws Exception {
		Carro gol = new Carro ("Gol", 1.8);
		assertEquals(Double.valueOf(1.8), gol.obterPotencia());
	}	
	

}
