package com.ies.poo.pedrolcsz.teste.carteira;

public class Carteira {

	private static Double saldo;

	Euro eu = new Euro();
	Dolar dol = new Dolar();
	Peso pe = new Peso();

	public static Double getSaldo() {
		return saldo;
	}

	public static void setSaldo(Double saldo) {
		Carteira.saldo = saldo;
	}

	public void adicionarDinheiro(Double valor, String moeda) {
		if (moeda.equals("Dolar")) {
			setSaldo(getSaldo() + valor * dol.valorDolar());
		} else if (moeda.equals("Euro")) {
			setSaldo(getSaldo() + valor * eu.valorEuro());
		} else {
			setSaldo(getSaldo() + valor * pe.valorPeso());
		}
	}

	public void retirarDinheiro(Double valor, String moeda) {
		if (moeda.equals("Dolar")) {
			setSaldo(getSaldo() - valor * dol.valorDolar());
		} else if (moeda.equals("Euro")) {
			setSaldo(getSaldo() - valor * eu.valorEuro());
		} else if (moeda.equals("Peso")) {
			setSaldo(getSaldo() - valor * pe.valorPeso());
		} else {
			System.out.println("Moeda inválida");
		}
	}

}