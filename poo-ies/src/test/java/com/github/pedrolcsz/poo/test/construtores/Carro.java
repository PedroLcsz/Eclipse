package com.ies.poo.pedrolcsz.teste.construtores;

public class Carro {

	private Double preco;
	private String cor;
	private String modelo;

	public Carro() {

	}

	public Carro(String modelo, Double preco) {
		this.setCor("Preto");
		this.setModelo(modelo);
		this.setPreco(preco);

	}

	public Carro(String cor, String modelo, Double preco) {
		this.setCor(cor);
		this.setModelo(modelo);
		this.setPreco(preco);

	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
