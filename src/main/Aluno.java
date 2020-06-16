package main;
import java.util.ArrayList;

public class Aluno {
	int matricula;
	String nomeAluno;
	
	ArrayList<Aluno>listaAlu = new ArrayList<Aluno>();

	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String getNomeAluno() {
		return nomeAluno;
	}
	
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}	
	
	public void AddAluInList(int matricula, String nomeAluno) {
		listaAlu.add(addAlu(matricula, nomeAluno));
	}
		
	private static Aluno addAlu(int matricula, String nomeAluno) {
		Aluno alu = new Aluno();
		alu.setMatricula(matricula);
		alu.setNomeAluno(nomeAluno);
		return alu;
	}
}
