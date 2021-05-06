package com.ies.poo.pedrolcsz.teste.construtores.novo.explicito;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteExplicito {

	@Test
	public void testExplicito() throws Exception {
		
		Explicito triciclo = new Explicito(Integer.valueOf(3));
		triciclo.obterRodas();

		assertEquals(Integer.valueOf(3), triciclo.obterRodas());
	}

}
