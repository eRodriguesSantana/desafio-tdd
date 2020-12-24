package jokenpo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Jogador {

	private String jogada;

	public static boolean empate(Jogador jogador1, Jogador jogador2) {
		if (jogador1.getJogada().equals(jogador2.getJogada()))
			return true;
		return false;
	}

	public static boolean pedraGanhaDeTesoura(Jogador jogador1, Jogador jogador2) {
		if (jogador1.getJogada().equals("Pedra") && jogador2.getJogada().equals("Tesoura")
				|| jogador1.getJogada().equals("Tesoura") && jogador2.getJogada().equals("Pedra"))
			return true;
		return false;
	}

	public static boolean tesouraDeveGanharDePapel(Jogador jogador1, Jogador jogador2) {
		if (jogador1.getJogada().equals("Papel") && jogador2.getJogada().equals("Tesoura")
				|| jogador1.getJogada().equals("Tesoura") && jogador2.getJogada().equals("Papel"))
			return true;
		return false;
	}

	public static Object papelDeveGanharDePedra(Jogador jogador1, Jogador jogador2) {
		if (jogador1.getJogada().equals("Papel") && jogador2.getJogada().equals("Pedra")
				|| jogador1.getJogada().equals("Pedra") && jogador2.getJogada().equals("Papel"))
			return true;
		return false;
	}
}
