package entidades;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	//ATRIBUTOS
	
	private String nome;
	private String matricula;
	private List<Turma> turmas = new ArrayList<>();
	private List<Double> notas = new ArrayList();
	
	//CONSTRUTOR
	
	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	
	//GETTERS
	
	public String getNome() {
		return nome;
	}


	public String getMatricula() {
		return matricula;
	}


	public List<Turma> getTurmas() {
		return turmas;
	}


	public List<Double> getNotas() {
		return notas;
	}


	//METODOS

	private void exibirHistorico() {}
	
	private double media() {
		return 0;}
	
	private double calculaCR() {
		return 0;}
}
