package poo_exercicios.exercicio1Testes;

import poo_exercicios.exercicio1.Veiculo;

public class VeiculoServiceTestes {
	
	private static Veiculo veiculo;

	public boolean velocidade(int velocidade) {
		if(velocidade > 0)
			return true;
		return false;
	}
}
