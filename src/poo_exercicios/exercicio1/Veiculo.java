package poo_exercicios.exercicio1;

public class Veiculo {

	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	private double preco;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void acelerar() {
		this.velocidade += 20;
	}
	
	public void frear() {
		this.velocidade -= 20;
	}
	
	public int abastecer(int combustivel) {
		if(this.litrosCombustivel <= 60 && combustivel < (60 - this.litrosCombustivel) && combustivel > 0)
			return this.litrosCombustivel += combustivel;
		else
			return 0;
	}
	
	public void pintar(String cor) {
		this.cor = cor;
	}
	
	public void ligar() {
		if(this.isLigado == false)
			this.isLigado = true;
	}
	
	public void desligar() {
		while(this.velocidade >= 0) {
			System.out.println(this.getVelocidade());
			this.frear();			
		}
		this.isLigado = false;
	}
	
	public int velocidade() {
		if(this.velocidade > 0) {
			return 1;
			
		}
		return 0;
	}
	
	public void dadosVeiculo() {
		System.out.println("Marca: " + this.getMarca());
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Placa: " + this.getPlaca());
		System.out.println("Cor: " + this.getCor());
		System.out.printf("KM: %.2f\n", this.getKm());
		System.out.println("Ligado/Desligado: " + this.isLigado());
		System.out.println("Combustível: " + this.getLitrosCombustivel());
		System.out.println("Velocidade: " + this.getVelocidade());
		System.out.printf("Preço: %.3f\n", this.getPreco());
	}
}