package poo_exercicios.exercicio2Testes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import poo_exercicios.exercicio2.model.VideoGame;

public class VideoGameTestes {

	private VideoGame videoGame;
	
	@Before
	public void setup() {
		videoGame = new VideoGame();
	}
	
	@Test
	public void deveVerificarSeEhUsadoOuNao() throws Exception {
		videoGame.setUsado(true);
		assertEquals(true, videoGame.isUsado());
	}
	
	@Test
	public void deveCalcularImposto25PorcentoSeForUsado() throws Exception {
		videoGame.setUsado(true);
		videoGame.setPreco(2500);
		assertEquals(625, videoGame.calculaImposto(), 0.0001);
	}
	
	@Test
	public void deveCalcularImposto45PorcentoSeForNovo() throws Exception {
		videoGame.setUsado(false);
		videoGame.setPreco(4500);
		assertEquals(2025, videoGame.calculaImposto(), 0.0001);
	}
	
	@Test
	public void deveImpedirDeAtribuirPrecoNegativo() throws Exception {
		videoGame.setPreco(-122);
		assertEquals(0, videoGame.preco(), 0.0001);
	}
	
	@Test
	public void deveImpedirDeAtribuirQuantidadeNegativa() throws Exception {
		videoGame.setQtd(-122);
		assertEquals(0, videoGame.quantidade(), 0.0001);
	}
}
