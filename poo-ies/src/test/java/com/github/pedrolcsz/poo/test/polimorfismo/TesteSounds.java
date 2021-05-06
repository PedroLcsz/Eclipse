package com.ies.poo.pedrolcsz.teste.polimorfismo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteSounds {

	@Test
	public void testAnimais() throws Exception {
		Animal animal = new Animal();
		animal.animalSomEMovimento();
		assertEquals("Isso aqui é só teste", animal.animalSomEMovimento());
	}

	@Test
	public void testSoundBoi() throws Exception {
		Animal boi = new Boi();
		boi.animalSomEMovimento();

		assertEquals("Muuu", boi.animalSomEMovimento());

	}

	@Test
	public void testSuper() throws Exception {
		Animal vaca = new Vaca();

		vaca.animalSomEMovimento();

		assertEquals("Muuu e andando no campo", vaca.animalSomEMovimento());

	}
}
