package com.ies.poo.pedrolcsz.teste.threads;

public class ThreadsTeste {

	public static void main(String[] args) throws InterruptedException {
			Runnable tarefa = new Tarefa();
			Thread thread = new Thread(tarefa);
			System.out.println("1. Antes de começar a segunda thread: ");
			thread.start();
			System.out.println("2. Depois de começar a segunda thread: ");
			thread.join();
			System.out.println("5. Depois de unir a segunda thread: ");
		
	}
	
	public static class Tarefa implements Runnable{
		public void run() {
			System.out.println("3. Antes de dormir");
			try {
				Thread.sleep(2000);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("4. Depois de dormir");
		
		}
	}
}
