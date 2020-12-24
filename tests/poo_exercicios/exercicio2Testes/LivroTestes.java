package poo_exercicios.exercicio2Testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import poo_exercicios.exercicio2.model.Livro;

public class LivroTestes {

	private Livro livro;
	
	@Before
	public void setup() {
		livro = new  Livro();
	}
	
	@Test
	public void deveImpedirDeAtribuirQuantidadeNegativa() throws Exception {
		livro.setQtd(-122);
		assertEquals(0, livro.quantidade(), 0.0001);
	}
	
	@Test
	public void deveImpedirDeAtribuirPrecoNegativo() throws Exception {
		livro.setPreco(-122);
		assertEquals(0, livro.preco(), 0.0001);
	}
	
	@Test
	public void naoCalcularImpostoSeForTemaEducativo() throws Exception {
		livro.setTema("Educativo");
		livro.setPreco(80);
		assertEquals(0, livro.calculaImposto(), 0.0001);
	}
	
}
