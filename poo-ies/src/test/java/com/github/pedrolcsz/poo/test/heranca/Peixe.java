package com.ies.poo.pedrolcsz.teste.heranca;

public class Peixe extends Animal {

	private String caracteristica;

	public Peixe(String nome, Float comprimento, Integer numPatas, String cor, String ambiente, Float velMedia, String caracteristica) {
		super(nome, comprimento, numPatas, cor, ambiente, velMedia);
		this.setCaracteristica(caracteristica);
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public String dadosDoPeixe() {
		return "Peixe [nome= " + this.getNome() + ", comprimento= "
				+ this.getComprimento() + " cm, numPatas= " + this.getNumPatas() + ", cor= " + this.getCor() + ", ambiente= "
				+ this.getAmbiente() + ", velMedia= " + this.getVelMedia() + " m/s, caracteristica= " + caracteristica + "]";
	}
}
