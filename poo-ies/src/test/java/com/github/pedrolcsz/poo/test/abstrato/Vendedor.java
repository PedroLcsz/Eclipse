package com.ies.poo.pedrolcsz.teste.abstrato;

public class Vendedor extends Funcionario {

	private Double salarioVendedor;
	private Double comissao;
	private Double comissaoTotal;

	public Vendedor(String nome,String registro, Double comissao) {
		this.setComissao(comissao);
		this.setNome(nome);
		this.setRegistro(registro);
	}

	@Override
	public Double calculaSalario() {
		this.setComissaoTotal(this.getSalarioBase() * this.getComissao());
		return salarioVendedor = Double.sum(this.getSalarioBase(), this.getComissaoTotal());
	}

	public Double getSalarioVendedor() {
		return salarioVendedor;
	}

	public void setSalarioVendedor(Double salarioVendedor) {
		this.salarioVendedor = salarioVendedor;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

	public Double getComissaoTotal() {
		return comissaoTotal;
	}

	public void setComissaoTotal(Double comissaoTotal) {
		this.comissaoTotal = comissaoTotal;
	}

}
