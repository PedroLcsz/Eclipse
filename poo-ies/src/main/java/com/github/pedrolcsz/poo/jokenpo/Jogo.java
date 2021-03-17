package com.github.pedrolcsz.poo.jokenpo;

public class Jogo {

	Aposta primeira;
	Aposta segunda;

	public Object obterResultado() {
		
		if (primeira.pedraPapelTesoura == "Pedra") {
			return "Alberto Venceu!!";
		} else {
			return "Souza Venceu";
		}
		
	}

	public void adicionarAposta(Aposta pedraPapelTesoura) {
		if (primeira == null) {
			primeira = pedraPapelTesoura;
		} else {
			segunda = pedraPapelTesoura;
		}

	}

}
