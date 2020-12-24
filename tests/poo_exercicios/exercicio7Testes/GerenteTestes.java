package poo_exercicios.exercicio7Testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import poo_exercicios.exercicio7.Gerente;

public class GerenteTestes {

	private Gerente gerente;
	
	@Before
	public void setup() {
		gerente = new Gerente();
	}
	
	@Test
	public void deveBonificarGerente() throws Exception {
		gerente.setSalario(5000);
		assertEquals(15000, gerente.bonificacao(), 0.0001);
	}
	
	@Test
	public void deveImpedirIdadeComValorNegativo() throws Exception {
		gerente.setIdade(-23);
		assertEquals(0, gerente.getIdade());
	}
	
	@Test
	public void deveImpedirSalarioComValorNegativo() throws Exception {
		gerente.setSalario(-122);
		assertEquals(0, gerente.getSalario(), 0.0001);
	}
}
