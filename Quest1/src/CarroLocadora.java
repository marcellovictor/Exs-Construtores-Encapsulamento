
public class CarroLocadora {

	//ATRIBUTOS
	
	private String marca;
	private String modelo;
	private String cor;
	private String placa;
	
	private double precoDiaria;
	private boolean alugado;
	
	//CONSTRUTOR
	
	public CarroLocadora(String marca, String modelo, String cor, String placa, double precoDiaria) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.placa = placa;
		this.precoDiaria = precoDiaria;
		this.alugado = false;
	}
	
	//METODOS
	
	public void alugar() {}
	
	public double precoAluguel(int dias) {return dias*this.precoDiaria;}
	
	
	
	
}
