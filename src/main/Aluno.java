package main;
import java.util.ArrayList;

public class Aluno {
	int matricula;
	String nomeAluno;
	
	private static ArrayList<Aluno>listaAlu = new ArrayList<Aluno>();

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
	
	public String SelectAluno(int matricula2) {
		String nomeAlunoAux=null;
		for(Aluno lista : listaAlu) {
			if(matricula2 == lista.getMatricula()) {
				nomeAlunoAux = lista.getNomeAluno();
			}
		}
		return nomeAlunoAux;
	}
	
	public void ListarAlunos() {
		System.out.println("\nListagem de Alunos: ");
		for(Aluno lista : listaAlu) {
			System.out.println("\nMatrícula: "+ lista.getMatricula() +
					"\nNome: "+ lista.getNomeAluno());		
		}
	}
	
	public void AddAluInList(int matricula2, String nomeAluno2) {
		listaAlu.add(addAlu(matricula2, nomeAluno2));
	}
		
	private static Aluno addAlu(int matricula2, String nomeAluno2) {
		Aluno alu = new Aluno();
		alu.setMatricula(matricula2);
		alu.setNomeAluno(nomeAluno2);
		return alu;
	}
}
