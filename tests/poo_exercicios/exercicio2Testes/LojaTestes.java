package poo_exercicios.exercicio2Testes;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import poo_exercicios.exercicio2.model.Livro;
import poo_exercicios.exercicio2.model.Loja;
import poo_exercicios.exercicio2.model.VideoGame;

public class LojaTestes {

	private Loja americanas;
	
	@Before
	public void setup() {
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
		
		americanas = new Loja("Americanas", "12345678", livros, games);
	}
	
	@Test
	public void deveCalcularOPatrimonioDaLoja() throws Exception {
		assertEquals(941800, americanas.calculaPatrimonio(), 0.0001);
	}
	
	@Test
	public void deveCalcularEstoqueDeVideoGames() throws Exception {
		assertEquals(3, americanas.estoqueVideogames());
	}
	
	@Test
	public void deveCalcularEstoqueDeLivros() throws Exception {
		assertEquals(3, americanas.estoqueLivros());
	}
	
	@Test
	public void deveCalcularValorEstoqueDeLivros() throws Exception {
		assertEquals(4800, americanas.valorEstoqueLivros(), 0.0001);
	}
	
	@Test
	public void deveCalcularValorEstoqueDeVideoGames() throws Exception {
		assertEquals(937000, americanas.valorEstoqueVideoGames(), 0.0001);
	}
	
	@Test
	public void deveImpedirLojaSemCNPJ() throws Exception {
		assertEquals(true, americanas.possuiCNPJ());
	}
}
