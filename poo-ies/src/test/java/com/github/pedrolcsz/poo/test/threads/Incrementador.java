package com.ies.poo.pedrolcsz.teste.threads;

public class Incrementador implements Runnable {

	@Override
	public void run() {
		Integer incrementador = 0;
		while (incrementador != 1000) {
			incrementador++;
			System.out.println("INCREMENTO = " + incrementador);
			System.out.println("");
		}

	}

}
