package main;

public abstract class NotaAvaliacao {
	int matriculaAluno;
	String nomeAluno;
	
	int codDisciplina;
	double mediaAritimetica;
	double mediaPonderada;
	
	String nomeDisciplica;
	
	public int getCodDisciplina() {
		return codDisciplina;
	}
	public void setCodDisciplina(int codDisciplina) {
		this.codDisciplina = codDisciplina;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public int getMatriculaAluno() {
		return matriculaAluno;
	}
	public void setMatriculaAluno(int matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}
	public String getNomeDisciplica() {
		return nomeDisciplica;
	}
	public void setNomeDisciplica(String nomeDisciplica) {
		this.nomeDisciplica = nomeDisciplica;
	}
	public double getMediaAritimetica() {
		return mediaAritimetica;
	}
	public void setMediaAritimetica(double mediaA) {
		this.mediaAritimetica = mediaA;
	}
	public double getMediaPonderada() {
		return mediaPonderada;
	}
	public void setMediaPonderada(double d) {
		this.mediaPonderada = d;
	}
}
