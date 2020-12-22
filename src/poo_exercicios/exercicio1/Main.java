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
		
		// Teste do método acelerar()
		if(veiculo.isLigado()) {
			veiculo.acelerar();
			System.out.println("\nNova velocidade com a chamada do método acelerar(): " + veiculo.getVelocidade());
		} else {
			System.out.println("\nVeículo desligado. Não é possível acelerar.");
		}
		
		// Teste do método abastecer()
		if(veiculo.isLigado()) {
			System.out.println("\nVeículo ligado. Desligue antes de abastecer.");			
		} else {
			if(veiculo.abastecer(20) > 0)
				System.out.println("\nNovo combustível: " + veiculo.getLitrosCombustivel() + " litros.");
			else
				System.out.println("\nLimite do tanque é de 60 litros. Para completar o tanque ou abastecer um pouco mais, solicite até no máximo " + (60 - veiculo.getLitrosCombustivel()) + "litros.");
		}
		
		// Teste do método frear()
		if(veiculo.isLigado()) {
			veiculo.frear();
			System.out.println("\nNova velocidade com a chamada do método frear(): " + veiculo.getVelocidade());
		} else {
			System.out.println("\nVeículo desligado. Não é necessário frear.");
		}
		
		// Teste do método pintar(String cor)
		veiculo.pintar("Preto");
		System.out.println("\nNova cor do veículo: " + veiculo.getCor());
		
		// Teste do método ligar()
		veiculo.ligar();
		System.out.println("\nChamada do método ligar(): " + veiculo.isLigado());
		
		System.out.println();
		
		// Teste do método desligar()
		System.out.println("Chamada do método desligar()");
		veiculo.desligar();
		System.out.println("Chamada do método desligar(): " + veiculo.isLigado() + " (false indica veículo desligado)");		
	}

}
