package entidades;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

	//ATRIBUTOS
	
	private String nome;
	private String ementa;
	private int codigo;
	private List<Disciplina> preRequisitos = new ArrayList<>();
	
	//METODOS
	
	private void imprimeEmentaDetalhada() {}
}
