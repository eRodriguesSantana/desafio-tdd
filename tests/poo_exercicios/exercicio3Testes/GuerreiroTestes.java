package poo_exercicios.exercicio3Testes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import poo_exercicios.exercicio3.Guerreiro;

public class GuerreiroTestes {

	private Guerreiro guerreiro;
	
	@Before
	public void setup() {
		guerreiro = new Guerreiro();
		
		guerreiro.setNome("Titti");
		guerreiro.setVida(-2);
		guerreiro.setMana(2);
		guerreiro.setXp(5);
		guerreiro.setInteligencia(20);
		guerreiro.setForca(1);
		guerreiro.setLevel(2);
		guerreiro.attack();
		guerreiro.aprenderHabilidade("Kame-Hame-Ha");
	}
	
	@Test
	public void deveContabilizarLevelUP() throws Exception {
		guerreiro.lvlUP();
		assertEquals(102, guerreiro.getMana());
		assertEquals(120, guerreiro.getInteligencia());
		assertEquals(52, guerreiro.getLevel());
	}
	
	@Test
	public void deveImpedirQueNumeroDeVidasSejaNegativo() throws Exception {
		assertEquals(0, guerreiro.getVida());
	}
}
