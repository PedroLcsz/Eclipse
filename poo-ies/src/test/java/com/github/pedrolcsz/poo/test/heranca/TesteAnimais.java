package com.ies.poo.pedrolcsz.teste.heranca;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteAnimais {

	@Test
	public void testCamelo() throws Exception {
		Mamifero camelo = new Mamifero("Camelo", Float.valueOf(150.0f), 4, "Amarelo", "Terra", Float.valueOf(2.0f));

		assertEquals(
				"Animal [nome= Camelo, comprimento= 150.0 cm, numPatas= 4, cor= Amarelo, ambiente= Terra, velMedia= 2.0 m/s]",
				camelo.dados());
	}

	@Test
	public void testTubarao() throws Exception {
		Peixe tubarao = new Peixe("Tubarao", Float.valueOf(300.0f), 0, "Cinzento", "Mar", Float.valueOf(1.5f),
				"Barbatanas e cauda");
		assertEquals(
				"Peixe [nome= Tubarao, comprimento= 300.0 cm, numPatas= 0, cor= Cinzento, ambiente= Mar, velMedia= 1.5 m/s, caracteristica= Barbatanas e cauda]",
				tubarao.dadosDoPeixe());
	}

	@Test
	public void testUrsoDoCanada() throws Exception {
		Mamifero ursoDoCanada = new Mamifero("Urso-do-canadá", Float.valueOf(180), 4, "Vermelho", "Terra",
				Float.valueOf(0.5f), "Mel");
		assertEquals(
				"Mamifero [nome= Urso-do-canadá, comprimento= 180.0 cm, numPatas= 4, cor= Vermelho, ambiente= Terra, velMedia= 0.5 m/s, alimento= Mel]",
				ursoDoCanada.dadosDoMamifero());
	}

}
