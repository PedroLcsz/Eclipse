package com.ies.poo.pedrolcsz.teste.abstrato;

public abstract class Funcionario {

	private String nome;
	private String registro;
	private Double salarioBase = 2000d;

	public abstract Double calculaSalario();

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

}
