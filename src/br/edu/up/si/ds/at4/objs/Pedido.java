package br.edu.up.si.ds.at4.objs;

public class Pedido {

	private String prato;
	
	private String bebida;
	
	private String vinho;
	
	private String observacao;
	
	private double totalPedido;

	public String getPrato() {
		return prato;
	}

	public void setPrato(String prato) {
		this.prato = prato;
	}

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

	public String getVinho() {
		return vinho;
	}

	public void setVinho(String vinho) {
		this.vinho = vinho;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public double getTotalPedido() {
		return totalPedido;
	}

	public void setTotalPedido(double totalPedido) {
		this.totalPedido = totalPedido;
	}
	
	
}
