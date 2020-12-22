package poo_exercicios.exercicio7;

public class Vendedor extends Funcionario{
	
	@Override
	public double bonificacao() {
		return super.getSalario() + 3000.00;
	}
}
