package poo_exercicios.exercicio7;

public class Main {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		Supervisor s = new Supervisor();
		Vendedor v = new Vendedor();
		
		g.setNome("Du");
		g.setSalario(5000.00);
		System.out.println(g.getNome() + ": Salário + Bonificação: " + g.bonificacao());
		
		s.setNome("Dudu");
		s.setSalario(6000.00);
		System.out.println(s.getNome() + ": Salário + Bonificação: " + s.bonificacao());
		
		v.setNome("Edu");
		v.setSalario(7000.00);
		System.out.println(s.getNome() + ": Salário + Bonificação: " + v.bonificacao());		
	}
}
