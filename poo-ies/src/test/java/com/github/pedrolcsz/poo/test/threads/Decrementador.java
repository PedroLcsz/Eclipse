package com.ies.poo.pedrolcsz.teste.threads;

public class Decrementador implements Runnable {

	@Override
	public void run() {
		Integer decrementador = 1000;
			while (decrementador != 0) {
				decrementador--;
				System.out.println("Decremento = " + decrementador);
				System.out.println("");

			}

	}

}
