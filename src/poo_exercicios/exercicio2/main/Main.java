package poo_exercicios.exercicio2.main;

import java.util.ArrayList;

import poo_exercicios.exercicio2.model.Livro;
import poo_exercicios.exercicio2.model.Loja;
import poo_exercicios.exercicio2.model.VideoGame;

public class Main {

	public static void main(String[] args) {
		
		Livro l1 = new Livro("Harry Potter", 40, 50, "J. K. Rowling", "fantasia", 300);
		Livro l2 = new Livro("Senhor dos Anéis", 60, 30, "J. R. R. Tolkien", "fantasia", 500);
		Livro l3 = new Livro("Java POO", 20, 50, "GFT", "educativo", 500);
		
		VideoGame ps4 = new VideoGame("PS4", 1800, 100, "Sony", "Slim", false);
		VideoGame ps4Usado = new VideoGame("PS4", 1000, 7, "Sony", "Slim", true);
		VideoGame xbox	= new VideoGame("XBOX", 1500, 500, "Microsoft", "One", false);
		
		ArrayList<Livro> livros = new ArrayList<Livro>();
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);
		
		ArrayList<VideoGame> games = new ArrayList<VideoGame>();
		games.add(ps4);
		games.add(ps4Usado);
		games.add(xbox);
		
		Loja americanas = new Loja("Americanas", "12345678", livros, games);
		
		pagarOuNaoPagarImpostoLivro(l2);
		pagarOuNaoPagarImpostoLivro(l3);
		
		pagarOuNaoPagarImpostoVideoGame(ps4Usado);
		pagarOuNaoPagarImpostoVideoGame(ps4);
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("A loja " + americanas.getNome() + " possui estes livros para a venda:");
		americanas.listaLivros();
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("A loja " + americanas.getNome() + " possui estes video-games para a venda:");
		americanas.listaVideogames();
		
		System.out.println("-----------------------------------------------------------------");		
		
		System.out.println("O patrimonio da loja: " + americanas.getNome() + " é de R$ " + americanas.calculaPatrimonio());
	}
	
	// Método auxiliar para melhor exibição dos dados do objeto Livro
	public static void pagarOuNaoPagarImpostoLivro(Livro livro) {
		if(livro.calculaImposto() > 0)
			System.out.println("R$ " + livro.calculaImposto() + " de imposto sobre o livro " + livro.getNome() + ".");
		else
			System.out.println("Livro educativo não tem imposto: " + livro.getNome());
	}
	
	// Método auxiliar para melhor exibição dos dados do objeto Video-game
	public static void pagarOuNaoPagarImpostoVideoGame(VideoGame game) {
		if(game.isUsado())
			System.out.println("Imposto " + game.getNome() + " usado, R$ " + game.calculaImposto() + ".");
		else
			System.out.println("Imposto " + game.getNome() + " R$ " + game.calculaImposto() + ".");
	}

}
