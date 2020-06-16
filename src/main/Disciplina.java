package main;
import java.util.ArrayList;

public class Disciplina {
	int codigoDisciplina;
	String nomeDisciplina;
	String tipoDisciplina;

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
	
	public String getTipoDisciplina() {
		return tipoDisciplina;
	}

	public void setTipoDisciplina(String tipoDisciplina) {
		this.tipoDisciplina = tipoDisciplina;
	}
	
	public void ListarDisciplinas() {
		System.out.println("\nListagem de Disciplinas: ");
		for(Disciplina lista : listaDisciplina) {
			System.out.println("\nCod: "+ lista.getCodigoDisciplina()+
					"\nNome: "+ lista.getNomeDisciplina()+
					"\nTipo: "+ lista.getTipoDisciplina());					
		}
	}
	
	public String SelectDisciplina(int codigoDisciplina2) {
		String nomeDisciplinaAux=null;
		for(Disciplina lista : listaDisciplina) {
			
		}
		return nomeDisciplinaAux;
	}
	
	public void AddDisciplinaInList(int codigoDisciplina2, String nomeDisciplina2, String tipoDisciplina2) {
		listaDisciplina.add(AddDisciplina(codigoDisciplina2, nomeDisciplina2, tipoDisciplina2));
	}
		
	private static Disciplina AddDisciplina(int codigoDisciplina2, String nomeDisciplina2, String tipoDisciplina2) {
		Disciplina materia = new Disciplina();
		materia.setCodigoDisciplina(codigoDisciplina2);
		materia.setNomeDisciplina(nomeDisciplina2);
		materia.setTipoDisciplina(tipoDisciplina2);
		return materia;
	}	
}
