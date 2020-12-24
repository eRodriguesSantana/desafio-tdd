package poo_exercicios.exercicio2.model;

import poo_exercicios.exercicio2.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto {

	private String marca;
	private String modelo;
	private boolean isUsado;

	public VideoGame() {
	}

	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	@Override
	public String toString() {
		return "Video-game: " + this.getModelo() +
				", preço: " + this.getPreco() +
				", quantidade: " + this.getQtd() + " em estoque.";
	}

	@Override
	public double calculaImposto() {
		if(this.isUsado == true) {
			return 0.25 * this.getPreco();
		} else {
			return 0.45 * this.getPreco();
		}
	}

	@Override
	public int preco() {
		if(this.getPreco() > 0)
			return 1;
		return 0;
	}

	@Override
	public int quantidade() {
		if(this.getQtd() > 0)
			return 1;
		return 0;
	}
	
}
