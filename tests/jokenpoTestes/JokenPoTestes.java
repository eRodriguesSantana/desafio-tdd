package jokenpoTestes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import jokenpo.Jogador;

public class JokenPoTestes {

	private Jogador jogador1;
	private Jogador jogador2;
	
	@Before
	public void setup() {
		jogador1 = new Jogador();
		jogador2 = new Jogador();
	}
	
	@Test
	public void pedraDeveEmpatarComPedra() throws Exception {		
		jogador1.setJogada("Pedra");
		jogador2.setJogada("Pedra");
		
		assertEquals(true, Jogador.empate(jogador1, jogador2));
	}
	
	@Test
	public void pedraDeveGanharDeTesoura() throws Exception {
		jogador1.setJogada("Pedra");
		jogador2.setJogada("Tesoura");
		
		assertEquals(true, Jogador.pedraGanhaDeTesoura(jogador1, jogador2));
	}
	
	@Test
	public void tesouraEmpataComTesoura() throws Exception {
		jogador1.setJogada("Pedra");
		jogador2.setJogada("Pedra");
		
		assertEquals(true, Jogador.empate(jogador1, jogador2));
	}
	
	@Test
	public void tesouraDeveGanharDePapel() throws Exception {
		jogador1.setJogada("Tesoura");
		jogador2.setJogada("Papel");
		
		assertEquals(true, Jogador.tesouraDeveGanharDePapel(jogador1, jogador2));
	}
	
	@Test
	public void papelEmpataComPapel() throws Exception {
		jogador1.setJogada("Papel");
		jogador2.setJogada("Papel");
		
		assertEquals(true, Jogador.empate(jogador1, jogador2));
	}
	
	@Test
	public void papelDeveGanharDePedra() throws Exception {
		jogador1.setJogada("Pedra");
		jogador2.setJogada("Papel");
		
		assertEquals(true, Jogador.papelDeveGanharDePedra(jogador1, jogador2));
	}
}
