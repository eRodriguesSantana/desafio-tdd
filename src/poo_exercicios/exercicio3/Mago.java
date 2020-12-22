package poo_exercicios.exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem{
	
	private List<String> magia = new ArrayList<>();

	public List<String> getMagia() {
		return magia;
	}

	public void setMagia(List<String> magia) {
		this.magia = magia;
	}
	
	@Override
	public void lvlUP() {
		this.setMana(this.getMana() + 100);
		this.setInteligencia(this.getInteligencia() + 100);
		this.setLevel(this.getLevel() + 50);
	}
	
	public int attack() {
		Random numeroAleatorio = new Random();
		return (this.getInteligencia() * this.getLevel()) + numeroAleatorio.nextInt(300);		
	}
	
	public void aprenderMagia(String magia) {
		this.magia.add(magia);
	}

	@Override
	public String toString() {
		return "Mago [magia=" + magia + ", nome=" + this.getNome() + ", vida=" + this.getVida() + ", mana=" + this.getMana() + ", xp=" + this.getXp()
				+ ", inteligencia=" + this.getInteligencia() + ", forca=" + this.getForca() + ", level=" + this.getLevel() + " ataque=" + this.attack() + "]";
	}
	
}
