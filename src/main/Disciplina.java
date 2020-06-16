package main;
import java.util.ArrayList;

public class Disciplina {
	int codigoDisciplina;
	String nomeDisciplina;
	
	ArrayList<Disciplina>listaAlu = new ArrayList<Disciplina>();

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
	
	public void AddDisciplinaInList(int codigoDisciplina, String nomeDisciplina) {
		listaAlu.add(AddDisciplina(codigoDisciplina, nomeDisciplina));
	}
		
	private static Disciplina AddDisciplina(int codigoDisciplina, String nomeDisciplina) {
		Disciplina materia = new Disciplina();
		materia.setCodigoDisciplina(codigoDisciplina);
		materia.setNomeDisciplina(nomeDisciplina);
		return materia;
	}	
}
