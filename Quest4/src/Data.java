
public class Data {

	//ATRIBUTOS
	
	private int dia;
	private int mesInt;
	private String mesStr;
	private int ano;
	private int diaAtualDoAno;
	private int totalDeDias;
	
	//CONSTRUTORES
	
	public Data(int dia, int mesInt, int ano) {
		this.dia = dia;
		this.mesInt = mesInt;
		this.ano = ano;
	}
	
	public Data(int dia, String mesStr, int ano) {
		this.dia = dia;
		this.mesStr = mesStr;
		this.ano = ano;
	}
	
	public Data(int totalDeDias, int diaAtualDoAno) {
		this.diaAtualDoAno = diaAtualDoAno;
		this.totalDeDias = totalDeDias;
	}
	
	//METODOS IMPRIMIR
	
	public void imprimeDataPadrao() {
		System.out.printf("%d/%d/%d\n", this.dia, this.mesInt, this.ano);
	}
	
	public void imprimeDataExtenso() {
		System.out.printf("%s %d, %d\n", this.mesStr, this.dia, this.ano);
	}
	
	public void imprimeContagemDias() {
		System.out.printf("%d %d\n", this.diaAtualDoAno, this.totalDeDias);
	}
}
