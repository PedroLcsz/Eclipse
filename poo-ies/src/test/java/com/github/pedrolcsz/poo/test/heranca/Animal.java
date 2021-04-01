package com.ies.poo.pedrolcsz.teste.heranca;

public class Animal {

	private String nome;
	private Float comprimento;
	private Integer numPatas;
	private String cor;
	private String ambiente;
	private Float velMedia;

	public Animal(String nome, Float comprimento, Integer numPatas, String cor, String ambiente, Float velMedia) {
		this.setNome(nome);
		this.setComprimento(comprimento);
		this.setNumPatas(numPatas);
		this.setCor(cor);
		this.setAmbiente(ambiente);
		this.setVelMedia(velMedia);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getComprimento() {
		return comprimento;
	}

	public void setComprimento(Float comprimento) {
		this.comprimento = comprimento;
	}

	public Integer getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(Integer numPatas) {
		this.numPatas = numPatas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public Float getVelMedia() {
		return velMedia;
	}

	public void setVelMedia(Float velMedia) {
		this.velMedia = velMedia;
	}

	public String dados() {
		return "Animal [nome= " + nome + ", comprimento= " + comprimento + " cm, numPatas= " + numPatas + ", cor= " + cor
				+ ", ambiente= " + ambiente + ", velMedia= " + velMedia + " m/s]";
	}

}
