package main;

import java.util.Scanner;
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
	
	public void AddNotasInList(int matricula2, String nomeAluno2, 
			int codigoDisciplina2, String nomeDisciplina2, int p12, int p22) {	
		listaNotaPratica.add(addNotas(codigoDisciplina2, nomeDisciplina2, matricula2, nomeAluno2, p12, p22));
	}
	
	public void ListarPraticas() {
		System.out.println("\nListagem de Notas Práticas: ");
		for(NotaAvaliacaoPratica lista : listaNotaPratica) {
			System.out.println("\nMatrícula: "+ lista.getMatriculaAluno() +
					"\nNome: "+ lista.getNomeAluno()+ "\nDisciplina: " + lista.getNomeDisciplica()+
					"\nNota T1: "+lista.getP1()+"\nNota T2: "+lista.getP2());		
		}
	}
	
	private static NotaAvaliacaoPratica addNotas(int matricula2, String nomeAluno2, 
					int codigoDisciplina2, String nomeDisciplina2, int p12, int p22) {
		NotaAvaliacaoPratica nota = new NotaAvaliacaoPratica();
		nota.setMatriculaAluno(matricula2);
		nota.setNomeAluno(nomeAluno2);
		nota.setCodDisciplina(codigoDisciplina2);
		nota.setNomeDisciplica(nomeDisciplina2);
		nota.setP1(p12);
		nota.setP2(p22);
		return nota;
	}
}
