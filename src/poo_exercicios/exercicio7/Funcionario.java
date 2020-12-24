package poo_exercicios.exercicio7;

public class Funcionario {

	private String nome;
	private int idade;
	private double salario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		if(this.idade > 0)
			return idade;
		return 0;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		if(this.salario > 0)
			return salario;
		return 0;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double bonificacao() {
		return this.salario;
	}

}
