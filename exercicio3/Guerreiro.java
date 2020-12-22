package poo_exercicios.exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {

	private List<String> habilidade = new ArrayList<>();

	public List<String> getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(List<String> habilidade) {
		this.habilidade = habilidade;
	}
	
	@Override
	public void lvlUP() {
		this.setMana(this.getMana() + 100);
		this.setInteligencia(this.getInteligencia() + 100);
		this.setLevel(this.getLevel() + 50);
	}
	
	public int attack() {
		Random numeroAleatorio = new Random();
		return (this.getForca() * this.getLevel()) + numeroAleatorio.nextInt(300);		
	}
	
	public void aprenderHabilidade(String habilidade) {
		this.habilidade.add(habilidade);
	}

	@Override
	public String toString() {
		return "Guerreiro [magia=" + habilidade + ", nome=" + this.getNome() + ", vida=" + this.getVida() + ", mana=" + this.getMana() + ", xp=" + this.getXp()
				+ ", inteligencia=" + this.getInteligencia() + ", forca=" + this.getForca() + ", level=" + this.getLevel() + "]";
	}
}
