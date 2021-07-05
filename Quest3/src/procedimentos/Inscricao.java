package procedimentos;

import entidades.Aluno;
import entidades.Turma;

public class Inscricao {

	//ATRIBUTOS
	
	private Aluno aluno;
	private Turma turma;
	
	//CONSTRUTOR
	
	public Inscricao(Aluno aluno, Turma turma) {
		super();
		this.aluno = aluno;
		this.turma = turma;
	}

	//GETTERS

	public Aluno getAluno() {
		return aluno;
	}


	public Turma getTurma() {
		return turma;
	}
	
	
}
