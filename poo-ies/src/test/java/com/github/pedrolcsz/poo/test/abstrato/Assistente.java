package com.ies.poo.pedrolcsz.teste.abstrato;

public class Assistente extends Funcionario {

	private Double salarioAssistente;

	public Assistente(String nome, String registro) {
		this.setNome(nome);
		this.setRegistro(registro);
	}

	@Override
	public Double calculaSalario() {
		return salarioAssistente = this.getSalarioBase();
	}

	public Double getSalarioAssistente() {
		return salarioAssistente;
	}

	public void setSalarioAssistente(Double salarioAssistente) {
		this.salarioAssistente = salarioAssistente;

	}

}
