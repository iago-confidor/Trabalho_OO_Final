package main;

import java.util.ArrayList;

public class NotaAvaliacaoPratica extends NotaAvaliacao{
	int p1, p2;
	
	private static ArrayList<NotaAvaliacaoPratica>listaNotaPratica = new ArrayList<NotaAvaliacaoPratica>();

	public int getP1() {
		return p1;
	}

	public void setP1(int p1) {
		this.p1 = p1;
	}

	public int getP2() {
		return p2;
	}

	public void setP2(int p2) {
		this.p2 = p2;
	}
	
	public void AddNotasInList(int matricula, String nomeAluno, 
			int codigoDisciplina, String nomeDisciplina, int p1, int p2) {	
		listaNotaPratica.add(addNotas(matricula, nomeAluno, codigoDisciplina, nomeDisciplina, p1, p2));
	}
			
	private static NotaAvaliacaoPratica addNotas(int matricula2, String nomeAluno2, 
					int codigoDisciplina2, String nomeDisciplina2, int p12, int p22) {
		NotaAvaliacaoPratica notaP = new NotaAvaliacaoPratica();
		notaP.setMatriculaAluno(matricula2);
		notaP.setNomeAluno(nomeAluno2);
		notaP.setCodDisciplina(codigoDisciplina2);
		notaP.setNomeDisciplica(nomeDisciplina2);
		notaP.setP1(p12);
		notaP.setP2(p22);
		return notaP;
	}
	
	public void ListarNotaPraticas() {
		System.out.println("\nListagem de Notas Teóricas: ");
		for(NotaAvaliacaoPratica lista : listaNotaPratica) {
			System.out.println("\nMatrícula: "+ lista.getMatriculaAluno() +
					"\nNome: "+ lista.getNomeAluno()+ "\nDisciplina: " + lista.getNomeDisciplica()+
					"\nNota P1: "+lista.getP1()+"\nNota P2: "+lista.getP2());	
		}
	}
}
