package poo_exercicios.exercicio3Testes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import poo_exercicios.exercicio3.Mago;

public class MagoTestes {
	
	private Mago mago;

	@Before
	public void setup() {	
		mago = new Mago();
		
		mago.setNome("Goku");
		mago.setVida(-3);
		mago.setMana(5);
		mago.setXp(7);
		mago.setInteligencia(10);
		mago.setForca(100);
		mago.setLevel(4);
		mago.attack();
		mago.aprenderMagia("Alquimagoia");
	}
	
	@Test
	public void deveContabilizarLevelUP() throws Exception {
		mago.lvlUP();
		assertEquals(105, mago.getMana());
		assertEquals(110, mago.getInteligencia());
		assertEquals(54, mago.getLevel());
	}
	
	@Test
	public void deveImpedirQueNumeroDeVidasSejaNegativo() throws Exception {
		assertEquals(0, mago.getVida());
	}
}
