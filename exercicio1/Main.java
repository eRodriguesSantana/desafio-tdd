package poo_exercicios.exercicio1;

public class Main {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo();
		
		veiculo.setMarca("BMW");
		veiculo.setModelo("BMW X1");
		veiculo.setPlaca("EDU-1989");
		veiculo.setCor("Azul");
		veiculo.setKm(1200.0f);
		veiculo.setLigado(true);
		veiculo.setLitrosCombustivel(31);
		veiculo.setVelocidade(120);
		veiculo.setPreco(250.000);
		veiculo.dadosVeiculo();
		
		System.out.println("\n#########################################");
		
		// Teste do m�todo acelerar()
		if(veiculo.isLigado()) {
			veiculo.acelerar();
			System.out.println("\nNova velocidade com a chamada do m�todo acelerar(): " + veiculo.getVelocidade());
		} else {
			System.out.println("\nVe�culo desligado. N�o � poss�vel acelerar.");
		}
		
		// Teste do m�todo abastecer()
		if(veiculo.isLigado()) {
			System.out.println("\nVe�culo ligado. Desligue antes de abastecer.");			
		} else {
			if(veiculo.abastecer(20) > 0)
				System.out.println("\nNovo combust�vel: " + veiculo.getLitrosCombustivel() + " litros.");
			else
				System.out.println("\nLimite do tanque � de 60 litros. Para completar o tanque ou abastecer um pouco mais, solicite at� no m�ximo " + (60 - veiculo.getLitrosCombustivel()) + "litros.");
		}
		
		// Teste do m�todo frear()
		if(veiculo.isLigado()) {
			veiculo.frear();
			System.out.println("\nNova velocidade com a chamada do m�todo frear(): " + veiculo.getVelocidade());
		} else {
			System.out.println("\nVe�culo desligado. N�o � necess�rio frear.");
		}
		
		// Teste do m�todo pintar(String cor)
		veiculo.pintar("Preto");
		System.out.println("\nNova cor do ve�culo: " + veiculo.getCor());
		
		// Teste do m�todo ligar()
		veiculo.ligar();
		System.out.println("\nChamada do m�todo ligar(): " + veiculo.isLigado());
		
		System.out.println();
		
		// Teste do m�todo desligar()
		System.out.println("Chamada do m�todo desligar()");
		veiculo.desligar();
		System.out.println("Chamada do m�todo desligar(): " + veiculo.isLigado() + " (false indica ve�culo desligado)");		
	}

}
