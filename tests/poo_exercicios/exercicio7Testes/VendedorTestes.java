package poo_exercicios.exercicio7Testes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import poo_exercicios.exercicio7.Vendedor;

public class VendedorTestes {

	private Vendedor vendedor;
	
	@Before
	public void setup() {
		vendedor = new Vendedor();
	}
	
	@Test
	public void deveBonificarVendedor() throws Exception {
		vendedor.setSalario(7000);
		assertEquals(10000, vendedor.bonificacao(), 0.0001);
	}
	
	@Test
	public void deveImpedirIdadeComValorNegativo() throws Exception {
		vendedor.setIdade(-23);
		assertEquals(0, vendedor.getIdade());
	}
	
	@Test
	public void deveImpedirSalarioComValorNegativo() throws Exception {
		vendedor.setSalario(-122);
		assertEquals(0, vendedor.getSalario(), 0.0001);
	}
}
