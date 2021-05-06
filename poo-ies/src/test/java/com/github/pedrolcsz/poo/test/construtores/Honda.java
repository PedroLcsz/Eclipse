package com.ies.poo.pedrolcsz.teste.construtores;

public class Honda extends Carro {

	private String motor;

	public Honda() {

	}

	public Honda(String motor, String modelo, Double preco) {
		super(modelo, preco);
		this.setMotor(motor);
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

}
