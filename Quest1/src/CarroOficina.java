
public class CarroOficina {

	//ATRIBUTOS
	
	private String marca;
	private String modelo;
	private String cor;
	private String placa;
	
	private String anoDeLancamento;
	private double precoRevisao;
	
	//CONSTRUTOR
	
	public CarroOficina(String marca, String modelo, String cor, String placa, String anoDeLancamento, double precoRevisao) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.placa = placa;
		this.anoDeLancamento = anoDeLancamento;
		this.precoRevisao = precoRevisao;
	}
	
	//METODOS
	
	public void reparar() {}
	
	public void testarPeca(String peca) {}
	
	public void trocarPeca(String peca) {}

	
}
