package com.ies.poo.pedrolcsz.teste.abstrato;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TesteFuncionario {

	@Test
	public void testGerente() throws Exception {
		Funcionario pedro = new Gerente("Pedro", "1A1A");

		pedro.calculaSalario();

		assertEquals("Pedro recebe: " + Double.valueOf(4000), pedro.getNome() + " recebe: " + pedro.calculaSalario());

	}

	@Test
	public void testAssistente() throws Exception {
		Funcionario elton = new Assistente("Elton", "1A2A");

		elton.calculaSalario();

		assertEquals("Elton recebe: " + Double.valueOf(2000), elton.getNome() + " recebe: " + elton.calculaSalario());
	}

	@Test
	public void testVendedor() throws Exception {
		Funcionario alessandro = new Vendedor("Alessandro", "1A3B", 0.15d);

		alessandro.calculaSalario();

		assertEquals("Alessandro recebe: " + Double.valueOf(2300),
				alessandro.getNome() + " recebe: " + alessandro.calculaSalario());

	}

	@Test
	public void testListaFuncionarios() throws Exception {
		List<Funcionario> funcionarios = new ArrayList<>();

		Funcionario gerente = new Gerente("Pedro", "1A1A");
		Funcionario assistente = new Assistente("Lucas", "1A3B");
		Funcionario vendedor = new Vendedor("Elton", "1A6B", 0.15d);

		funcionarios.add(gerente);
		funcionarios.add(assistente);
		funcionarios.add(vendedor);

		Double valTotal = 0d;

		for (Integer i = 0; i < 3; i++) {
			valTotal += funcionarios.get(i).calculaSalario();
		}

		assertEquals("Salário total dos funcionários: " + Double.valueOf(8300d),
				"Salário total dos funcionários: " + valTotal);
	}
}
