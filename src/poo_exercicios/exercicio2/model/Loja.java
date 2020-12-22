package poo_exercicios.exercicio2.model;

import java.util.ArrayList;

public class Loja {

	private String nome;
	private String cnpj;
	private ArrayList<Livro> livros = new ArrayList<>();
	private ArrayList<VideoGame> videoGames = new ArrayList<>();

	public Loja() {
	}

	public Loja(String nome, String cnpj, ArrayList<Livro> livros, ArrayList<VideoGame> videoGames) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public ArrayList<Livro> getLivros() {
		return livros;
	}

	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}

	public ArrayList<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(ArrayList<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}
	
	public void listaLivros() {
		if(this.livros.size() > 0) {
			for(Livro livro: livros) {
				System.out.println(livro.toString());
			}
		} else {
			System.out.println("A loja não tem livros no seu estoque.");
		}
	}
	
	public void listaVideogames() {
		if(this.videoGames.size() > 0) {
			for(VideoGame videogame: videoGames) {
				System.out.println(videogame.toString());
			}
		} else {
			System.out.println("A loja não tem video-games no seu estoque.");
		}
	}
	
	public double calculaPatrimonio() {
		double totalPatrimonio = 0;
		
		for(VideoGame videogame: videoGames) {
			totalPatrimonio += videogame.getPreco() * videogame.getQtd();			
		}
		
		for(Livro livro: livros) {
			totalPatrimonio += livro.getPreco() * livro.getQtd();
		}
		
		return totalPatrimonio;
	}
}
