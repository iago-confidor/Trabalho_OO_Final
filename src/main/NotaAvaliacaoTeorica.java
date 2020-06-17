package main;

import java.util.ArrayList;

public class NotaAvaliacaoTeorica extends NotaAvaliacao{
	int t1, t2, t3;

	private static ArrayList<NotaAvaliacaoTeorica>listaNotaTeorica = new ArrayList<NotaAvaliacaoTeorica>();
	
	public int getT1() {
		return t1;
	}

	public void setT1(int t1) {
		this.t1 = t1;
	}

	public int getT2() {
		return t2;
	}

	public void setT2(int t2) {
		this.t2 = t2;
	}

	public int getT3() {
		return t3;
	}

	public void setT3(int t3) {
		this.t3 = t3;
	}
	
	public void AddNotasInList(int matricula2, String nomeAluno2, 
			int codigoDisciplina2, String nomeDisciplina2, int t12, int t22, int t32) {	
		listaNotaTeorica.add(addNotas(matricula2, nomeAluno2, codigoDisciplina2, nomeDisciplina2, t12, t22, t32));
	}
			
	private static NotaAvaliacaoTeorica addNotas(int matricula2, String nomeAluno2, 
					int codigoDisciplina2, String nomeDisciplina2, int t12, int t22, int t32) {
		NotaAvaliacaoTeorica notaT = new NotaAvaliacaoTeorica();
		notaT.setMatriculaAluno(matricula2);
		notaT.setNomeAluno(nomeAluno2);
		notaT.setCodDisciplina(codigoDisciplina2);
		notaT.setNomeDisciplica(nomeDisciplina2);
		notaT.setT1(t12);
		notaT.setT2(t22);
		notaT.setT2(t32);
		return notaT;
	}
	
	public void ListarTeoricas() {
		System.out.println("\nListagem de Notas Teóricas: ");
		for(NotaAvaliacaoTeorica lista : listaNotaTeorica) {
			System.out.println("\nMatrícula: "+ lista.getMatriculaAluno() +
					"\nNome: "+ lista.getNomeAluno()+ "\nDisciplina: " + lista.getNomeDisciplica()+
					"\nNota T1: "+lista.getT1()+"\nNota T2: "+lista.getT1()+"\nNota T3: "+lista.getT1());		
		}
	}
}
