package com.ies.poo.pedrolcsz.teste.heranca;

public class Mamifero extends Animal {

	private String alimento;

	public Mamifero(String nome, Float comprimento, Integer numPatas, String cor, String ambiente, Float velMedia) {
		super(nome, comprimento, numPatas, cor, ambiente, velMedia);
	}
	
	public Mamifero(String nome, Float comprimento, Integer numPatas, String cor, String ambiente, Float velMedia, String alimento) {
		super(nome, comprimento, numPatas, cor, ambiente, velMedia);
		this.setAlimento(alimento);
	}
	
	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	public String dadosDoMamifero() {
		return "Mamifero [nome= " + this.getNome() + ", comprimento= " + this.getComprimento()
				+ " cm, numPatas= " + this.getNumPatas() + ", cor= " + this.getCor() + ", ambiente= " + this.getAmbiente()
				+ ", velMedia= " + this.getVelMedia() + " m/s" +", alimento= " + alimento +"]";
	}
}
