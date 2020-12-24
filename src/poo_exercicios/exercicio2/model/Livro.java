package poo_exercicios.exercicio2.model;

import poo_exercicios.exercicio2.interfaces.Imposto;

public class Livro extends Produto implements Imposto{

	private String autor;
	private String tema;
	private int qtdPag;

	public Livro() {
	}

	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super(nome, preco, qtd);
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if(autor != null || autor != "")
			this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQtdPag() {
		return qtdPag;
	}

	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}	
	
	@Override
	public String toString() {
		return "Titulo: " + this.getNome() +
				", preço: " + this.getPreco() +
				", quantidade: " + this.getQtd() + " em estoque.";
				
	}

	@Override
	public double calculaImposto() {
		if(this.tema == "educativo" || this.tema == "Educativo" || this.tema == "EDUCATIVO") {
			return 0;
		} else {
			return 0.1 * this.getPreco();
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
