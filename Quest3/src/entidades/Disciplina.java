package entidades;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

	//ATRIBUTOS
	
	private String nome;
	private String ementa;
	private int codigo;
	private List<Disciplina> preRequisitos = new ArrayList<>();
	
	//CONSTRUTOR
	
	public Disciplina(String nome, String ementa, int codigo) {
		this.nome = nome;
		this.ementa = ementa;
		this.codigo = codigo;
	}


	//GETTERS E SETTERS
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEmenta() {
		return ementa;
	}



	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}



	public int getCodigo() {
		return codigo;
	}



	public List<Disciplina> getPreRequisitos() {
		return preRequisitos;
	}


	//METODOS

	private void imprimeEmentaDetalhada() {}
}
