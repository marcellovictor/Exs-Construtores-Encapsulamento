package entidades;

public class Turma {

	//ATRIBUTOS
	
	private Disciplina disciplina;
	private Professor professor;
	private int quantidadeDeAlunos;
	
	//CONSTRUTOR
	
	public Turma(Disciplina disciplina, Professor professor, int quantidadeDeAlunos) {
		this.disciplina = disciplina;
		this.professor = professor;
		this.quantidadeDeAlunos = quantidadeDeAlunos;
	}
	
	
	//GETTERS E SETTERS
	
	public Professor getProfessor() {
		return professor;
	}


	public void setProfessor(Professor professor) {
		this.professor = professor;
	}


	public int getQuantidadeDeAlunos() {
		return quantidadeDeAlunos;
	}

	
	public void setQuantidadeDeAlunos(int quantidadeDeAlunos) {
		this.quantidadeDeAlunos = quantidadeDeAlunos;
	}
	

	public Disciplina getDisciplina() {
		return disciplina;
	}


	//METODOS

	public String horariosDeAula() {
		return null;}
	
}
