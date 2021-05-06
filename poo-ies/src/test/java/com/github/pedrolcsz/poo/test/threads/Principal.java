package com.ies.poo.pedrolcsz.teste.threads;

public class Principal {
	public static void main(String[] args) throws InterruptedException {

		Runnable incrementador = new Incrementador();
		Runnable decrementador = new Decrementador();
		Thread threadUm = new Thread (incrementador);
		Thread threadDois = new Thread (decrementador);
		
		threadUm.start();
		threadDois.start();
		threadUm.join();
		threadDois.join();
	}

}
