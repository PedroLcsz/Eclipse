package com.ies.poo.pedrolcsz.teste.abstrato;

public class Gerente extends Funcionario {

	private Double salarioGerente;

	public Gerente(String nome, String registro) {
		this.setNome(nome);
		this.setRegistro(registro);
	}

	@Override
	public Double calculaSalario() {
		return salarioGerente = this.getSalarioBase() * 2;
	}

	public Double getSalarioGerente() {
		return salarioGerente;
	}

	public void setSalarioGerente(Double salarioGerente) {
		this.salarioGerente = salarioGerente;
	}

}
