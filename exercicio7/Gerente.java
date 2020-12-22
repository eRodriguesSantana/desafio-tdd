package poo_exercicios.exercicio7;

public class Gerente extends Funcionario{

	@Override
	public double bonificacao() {
		return super.getSalario() + 10000.00;
	}
}
