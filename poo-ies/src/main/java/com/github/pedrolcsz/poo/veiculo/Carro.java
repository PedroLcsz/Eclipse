package com.github.pedrolcsz.poo.veiculo;

public class Carro {
	
	public String nome;
	private Double potencia;

	public Carro(String nome, Double potencia) {
		this.nome = nome;
		this.potencia = potencia;
	}

	public Object obterPotencia() {
		return potencia;
	}

}
