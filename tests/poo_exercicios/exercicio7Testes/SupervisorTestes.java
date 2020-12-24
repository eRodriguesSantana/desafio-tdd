package poo_exercicios.exercicio7Testes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import poo_exercicios.exercicio7.Supervisor;

public class SupervisorTestes {

	private Supervisor supervisor;
	
	@Before
	public void setup() {
		supervisor = new Supervisor();
	}
	
	@Test
	public void deveBonificarSupervisor() throws Exception {
		supervisor.setSalario(6000);
		assertEquals(11000, supervisor.bonificacao(), 0.0001);
	}
	
	@Test
	public void deveImpedirIdadeComValorNegativo() throws Exception {
		supervisor.setIdade(-23);
		assertEquals(0, supervisor.getIdade());
	}
	
	@Test
	public void deveImpedirSalarioComValorNegativo() throws Exception {
		supervisor.setSalario(-122);
		assertEquals(0, supervisor.getSalario(), 0.0001);
	}
}
