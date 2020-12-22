package poo_exercicios.exercicio3;

public class Main {

	public static void main(String[] args) {

		Mago m = new Mago();
		Guerreiro g = new Guerreiro();
		
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
		
		
		System.out.println(m.toString());		
		m.lvlUP();
		System.out.println(m.toString());
		
		System.out.println("-----------------------------------------");
		System.out.println("-----------------------------------------");
		
		System.out.println(g.toString());		
		g.lvlUP();
		System.out.println(g.toString());
		
		System.out.println("-----------------------------------------");
		
		System.out.println("Quantidade de personagens: " + Personagem.quantidadePersonagem);

	}

}
