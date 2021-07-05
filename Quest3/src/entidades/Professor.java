package entidades;

import java.util.ArrayList;
import java.util.List;

public class Professor {

	//ATRIBUTOS
	
	private String nome;
	private List<Turma> turmas = new ArrayList<>();
	
	//PROFESSOR
	
	public Professor(String nome) {
		this.nome = nome;
	}

	
	//GETTERS
	

	public String getNome() {
		return nome;
	}

	public List<Turma> getTurmas() {
		return turmas;
	}
}
