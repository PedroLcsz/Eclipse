package com.github.pedrolcsz.poo.test.jokenpo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.github.pedrolcsz.poo.jokenpo.Aposta;
import com.github.pedrolcsz.poo.jokenpo.Jogo;

public class jokenpo {
	@Test
	public void pedra() throws Exception {
		Jogo jogo = new Jogo ();
		Aposta alberto = new Aposta("Pedra");
		Aposta souza = new Aposta("Tesoura");
		
		jogo.adicionarAposta(alberto);
		jogo.adicionarAposta(souza);
		
		jogo.obterResultado();
		
		assertEquals("Alberto Venceu!!",jogo.obterResultado());
	
	}
}
