package poo_exercicios.exercicio1Testes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import poo_exercicios.exercicio1.Veiculo;

public class VeiculoTestes {

	private Veiculo veiculo;
	
	@Before
	public void setup() {
		veiculo = new Veiculo();
	}
	
	@Test
	public void deveVerificarSeVeiculoEstaDesligadoParaAbastecimento() throws Exception {
		assertEquals(false, veiculo.isLigado());
	}
	
	@Test
	public void deveVerificarSeVeiculoEstaLigadoParaPoderAcelerarOuFrear() throws Exception {
		veiculo.setLigado(true);
		assertEquals(true, veiculo.isLigado());
	}
	
	@Test
	public void deveEvitarQueVelocidadeTenhaValorNegativo() throws Exception {
		veiculo.setVelocidade(-12);		
		assertEquals(0, veiculo.velocidade());
	}
	
	@Test
	public void deveEvitararQueQuantidadeCombustivelSejaNegativo() throws Exception {
		veiculo.abastecer(-12);
		assertEquals(0, veiculo.getLitrosCombustivel());
	}
	
	@Test
	public void deveImpedirQueUltrapasseOLimiteDe60LitrosDeCombustivel() throws Exception {
		veiculo.abastecer(70);
		assertEquals(0, veiculo.getLitrosCombustivel());
	}
	
}