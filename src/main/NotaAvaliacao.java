package main;

public abstract class NotaAvaliacao {
	int matriculaAluno;
	int codDisciplina;
	int mediaAritimetica;
	int mediaPonderada;
	
	String nomeDisciplica;
	String nomeAluno;

	
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
	public int getMediaAritimetica() {
		return mediaAritimetica;
	}
	public void setMediaAritimetica(int mediaAritimetica) {
		this.mediaAritimetica = mediaAritimetica;
	}
	public int getMediaPonderada() {
		return mediaPonderada;
	}
	public void setMediaPonderada(int mediaPonderada) {
		this.mediaPonderada = mediaPonderada;
	}
}
