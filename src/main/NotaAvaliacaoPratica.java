package main;

import java.util.ArrayList;

public class NotaAvaliacaoPratica extends NotaAvaliacao{
	double p1, p2;
	
	private static ArrayList<NotaAvaliacaoPratica>listaNotaPratica = new ArrayList<NotaAvaliacaoPratica>();

	public double getP1() {
		return p1;
	}

	public void setP1(double p1) {
		this.p1 = p1;
	}

	public double getP2() {
		return p2;
	}

	public void setP2(double p22) {
		this.p2 = p22;
	}
	
	public void CalculaMedia() {
		System.out.println("\nListagem de Médias - Notas Práticas: ");
		for(NotaAvaliacaoPratica lista : listaNotaPratica) {
			double mediaP=0, mediaA = 0;
			
			mediaP = (lista.getP1() * 1 + lista.getP2() * 2) / 3;
			lista.setMediaAritimetica(mediaA);
			mediaA = (lista.getP1() + lista.getP2()) / 2;
		}
	}
	
	public void AddNotasInList(int matricula, String nomeAluno, 
			int codigoDisciplina, String nomeDisciplina, double p1, double p2) {	
		listaNotaPratica.add(addNotas(matricula, nomeAluno, codigoDisciplina, nomeDisciplina, p1, p2));
	}
	
	
			
	private static NotaAvaliacaoPratica addNotas(int matricula2, String nomeAluno2, 
					int codigoDisciplina2, String nomeDisciplina2, double p12, double p22) {
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
					"\nNota P1: "+lista.getP1()+"\nNota P2: "+lista.getP2() +
					"\nMedia Ponderada: "+lista.getMediaPonderada()+ "\nMedia Aritmetica: "+ lista.mediaAritimetica);
		}
	}
}
