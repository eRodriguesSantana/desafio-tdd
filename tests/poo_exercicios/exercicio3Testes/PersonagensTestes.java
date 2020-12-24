package poo_exercicios.exercicio3Testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import poo_exercicios.exercicio3.Guerreiro;
import poo_exercicios.exercicio3.Mago;
import poo_exercicios.exercicio3.Personagem;

public class PersonagensTestes {

	private Mago m;
	private Guerreiro g;
	
	@Before
	public void setup() {
		m = new Mago();
		g = new Guerreiro();
		
		m.setNome("Goku");
		m.setVida(3);
		m.setMana(5);
		m.setXp(7);
		m.setInteligencia(10);
		m.setForca(100);
		m.setLevel(4);
		m.attack();
		m.aprenderMagia("Alquimia");
		
		g.setNome("Titti");
		g.setVida(2);
		g.setMana(2);
		g.setXp(5);
		g.setInteligencia(20);
		g.setForca(1);
		g.setLevel(2);
		g.attack();
		g.aprenderHabilidade("Kame-Hame-Ha");
	}
	
	@Test
	public void deveContarQuantidadeDePersonagens() throws Exception {
		assertEquals(4, Personagem.quantidadePersonagem);
	}
	
	@Test
	public void deveImpedirQueNumeroDeVidasSejaNegativo() throws Exception {
		assertEquals(2, g.getVida());
	}
}
