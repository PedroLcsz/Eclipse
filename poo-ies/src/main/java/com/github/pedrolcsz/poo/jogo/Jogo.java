package com.github.pedrolcsz.poo.jogo;

public class Jogo {

	Jogada primeira;
	Jogada segunda;

	public Object obterResultado() {
		Integer somaDasJogadas = Integer.sum(primeira.numero, segunda.numero);

		if (ÈParOuImpar(somaDasJogadas)) {
			return "Par";
		}
		return "Impar";
	}

	private boolean ÈParOuImpar(Integer somaDasJogadas) {
		return somaDasJogadas % 2 == 0;
	}

	public void adicionarJogada(Jogada parImpar) {
		if (primeira == null) {
			primeira = parImpar;
		} else {
			segunda = parImpar; 
		}
		
	}

}
