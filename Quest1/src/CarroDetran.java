
public class CarroDetran {

	//ATRIBUTOS
	
	private String marca;
	private String modelo;
	private String cor;
	private String placa;
	
	private String nomeDono;
	private String cpfDono;
	private boolean apreendido;
	private double valorMultaAcumulada;
	
	//CONSTRUTOR
	
	public CarroDetran(String marca, String modelo, String cor, String placa, String nomeDono, String cpfDono) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.placa = placa;
		this.nomeDono = nomeDono;
		this.cpfDono = cpfDono;
		this.apreendido = false;
		this.valorMultaAcumulada = 0.0;
	}
	
	//METODOS
	
	public void multar() {}
	
	public void apreender() {}
	
	public void alterarDono() {}
}
