package poo_exercicios.exercicio7;

public class Supervisor extends Funcionario{
	
	@Override
	public double bonificacao() {
		return super.getSalario() + 5000.00;
	}

}
