package main;

import java.util.ArrayList;

public class NotaAvaliacaoTeorica extends NotaAvaliacao{
	double t1, t2, t3;

	private static ArrayList<NotaAvaliacaoTeorica>listaNotaTeorica = new ArrayList<NotaAvaliacaoTeorica>();
	
	public double getT1() {
		return t1;
	}

	public void setT1(double t1) {
		this.t1 = t1;
	}

	public double getT2() {
		return t2;
	}

	public void setT2(double t2) {
		this.t2 = t2;
	}

	public double getT3() {
		return t3;
	}

	public void setT3(double t3) {
		this.t3 = t3;
	}

	public void CalculaMedia() {
		System.out.println("\nListagem de Médias - Notas Teóricas: ");
		for(NotaAvaliacaoTeorica lista : listaNotaTeorica) {
			double mediaP, mediaA;
			
			mediaP = ( lista.getT1() * 1 + lista.getT2() * 2 + lista.getT3() * 3) / 6;
			mediaA = ( lista.getT1() + lista.getT2() + lista.getT3() ) / 3;
		}
	}
	
	
	
	public void AddNotasInList(int matricula, String nomeAluno, 
			int codigoDisciplina, String nomeDisciplina, double t1, double t2, double t3) {	
		listaNotaTeorica.add(addNotas(matricula, nomeAluno, codigoDisciplina, nomeDisciplina, t1, t2, t3));
	}
			
	private static NotaAvaliacaoTeorica addNotas(int matricula2, String nomeAluno2, 
					int codigoDisciplina2, String nomeDisciplina2, double t12, double t22, double t32) {
		NotaAvaliacaoTeorica notaT = new NotaAvaliacaoTeorica();
		notaT.setMatriculaAluno(matricula2);
		notaT.setNomeAluno(nomeAluno2);
		notaT.setCodDisciplina(codigoDisciplina2);
		notaT.setNomeDisciplica(nomeDisciplina2);
		notaT.setT1(t12);
		notaT.setT2(t22);
		notaT.setT3(t32);
		return notaT;
	}
	
	public void ListarNotaTeoricas() {
		System.out.println("\nListagem de Notas Teóricas: ");
		for(NotaAvaliacaoTeorica lista : listaNotaTeorica) {
			System.out.println("\nMatrícula: "+ lista.getMatriculaAluno() +
					"\nNome: "+ lista.getNomeAluno()+ "\nDisciplina: " + lista.getNomeDisciplica()+
					"\nNota T1: "+lista.getT1()+"\nNota T2: "+lista.getT2()+"\nNota T3: "+lista.getT3() + 
					"\nMedia Ponderada: "+lista.getMediaPonderada()+ "\nMedia Aritmetica: "+ lista.mediaAritimetica);		
		}
	}
}
