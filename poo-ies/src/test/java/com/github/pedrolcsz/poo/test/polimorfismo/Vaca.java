package com.ies.poo.pedrolcsz.teste.polimorfismo;

public class Vaca extends Boi {
	public String animalSomEMovimento() {
		return super.animalSomEMovimento() + " e andando no campo";
	}

}
