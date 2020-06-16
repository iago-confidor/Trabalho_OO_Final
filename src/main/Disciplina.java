package main;
import java.util.ArrayList;

public class Disciplina {
	int codigoDisciplina;
	String nomeDisciplina;
	
	private static ArrayList<Disciplina>listaDisciplina = new ArrayList<Disciplina>();

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	
	public int getCodigoDisciplina() {
		return codigoDisciplina;
	}
	
	public void setCodigoDisciplina(int codigoDisciplina) {
		this.codigoDisciplina = codigoDisciplina;
	}
	
	public void ListarDisciplinas() {
		System.out.println("\nListagem de Disciplinas: ");
		for(Disciplina lista : listaDisciplina) {
			System.out.println("Matrícula: "+ lista.getCodigoDisciplina()+" - Nome: "+ lista.getNomeDisciplina());		
		}
	}
	
	public void AddDisciplinaInList(int codigoDisciplina2, String nomeDisciplina2) {
		listaDisciplina.add(AddDisciplina(codigoDisciplina2, nomeDisciplina2));
	}
		
	private static Disciplina AddDisciplina(int codigoDisciplina2, String nomeDisciplina2) {
		Disciplina materia = new Disciplina();
		materia.setCodigoDisciplina(codigoDisciplina2);
		materia.setNomeDisciplina(nomeDisciplina2);
		return materia;
	}	
}
