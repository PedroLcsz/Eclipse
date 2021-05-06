package com.ies.poo.pedrolcsz.teste.carteira;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteCarteira {

	@Test
	public void testCarteira() throws Exception {

		Carteira ct = new Carteira();

		Carteira.getSaldo();

		ct.adicionarDinheiro(5d, "Dolar");
		ct.adicionarDinheiro(2d, "Euro");
		ct.adicionarDinheiro(49.15d, "Peso");

		assertEquals("lalala", Carteira.getSaldo());

	}

}
