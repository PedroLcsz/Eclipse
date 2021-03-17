package com.github.pedrolcsz.poo.test.jogo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.github.pedrolcsz.poo.jogo.Jogada;
import com.github.pedrolcsz.poo.jogo.Jogo;
import com.github.pedrolcsz.poo.jogo.JogoDoParImpar;

public class JogoParImpar {

	@Test
	public void parOuImpar() throws Exception {
		Jogo jogo = new JogoDoParImpar();
		Jogada primeiro = new Jogada(2, "Ímpar");
		Jogada segundo = new Jogada(12, "par");

		jogo.adicionarJogada(primeiro);
		jogo.adicionarJogada(segundo);

		assertEquals("Par", jogo.obterResultado());

	}

}
