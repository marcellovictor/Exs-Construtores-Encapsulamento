
public class CarroRevendedora {

	//ATRIBUTOS
	
	private String marca;
	private String modelo;
	private String cor;
	private String placa;
	
	private double preco;
	private int KmRodados;
	
	//CONSTRUTOR
	
	public CarroRevendedora(String marca, String modelo, String cor, String placa, double preco, int kmRodados) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.placa = placa;
		this.preco = preco;
		this.KmRodados = kmRodados;
	}
	
	//METODOS
	
	public void comprar() {}
	
	public void vender() {}
}
