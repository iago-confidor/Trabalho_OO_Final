package main;

import java.util.Scanner;

public class MenuPrincipal {
	
	public static void main(String[] args) {
		int op = 0;
		
		do {
			Scanner read = new Scanner(System.in);		
			System.out.println("Sistema de Notas");
			System.out.println("1 - Add Aluno");
			System.out.println("2 - Add Disciplina");
			System.out.println("3 - Adicionar Notas");
			System.out.println("4 - Calcular M�dias");
			System.out.println("5 - Listar");
			System.out.println("6 - Sair");
			System.out.printf("Escolha a op��o: ");
			op = read.nextInt();
					
			switch(op) {
				case 1:
					AddAluno();
					break;
					
				case 2:
					AddDisciplina();
					break;
					
				case 3:
					AddNotas();
					break;
					
				case 4:
					CalcularMedias();
					break;
					
				case 5:
					ListarAlunos();
					break;
					
				case 6:
					System.out.println("Voc� saiu do sistema!");
					break;
					
				default:
					System.out.println("Op��o inv�lida! Digite uma op��o v�lida \n");
					break;
		}
	} while(op!=6);
}
	
	private static void ListarAlunos() {
		// TODO Auto-generated method stub
		
	}

	private static void CalcularMedias() {
		// TODO Auto-generated method stub
		
	}

	private static void AddDisciplina() {
		// TODO Auto-generated method stub
		
	}

	private static void AddAluno() {
		Scanner read = new Scanner(System.in);
		Aluno guri = new Aluno();
		String nomeAluno;
		int matricula;
		
	
		
		
	}

	private static void AddNotas() {
		Scanner read = new Scanner(System.in);
		
		int nota1, nota2, nota3;
		int media, contAluno=0;
		
		for (int i =  0 ; i <  3 ; i ++ ) {
			 contAluno++;
	            // recebe a 1� nota
	            System.out.println("Aluno " + contAluno + ", digite sua 1� nota");
	            nota1 = read.nextInt();
	            
	            // recebe a 2� nota
	            System.out.println("Aluno " + contAluno + ", digite sua 2� nota");
	            nota2 = read.nextInt();
	            
	            // recebe a 3� nota
	            System.out.println("Aluno " + contAluno + ", digite sua 3� nota");
	            nota3 = read.nextInt();
	            
	            // calcula a m�dia
	            media = (nota1 + nota2 + nota3) / 3;
	            System.out.println("A m�dia do aluno " + contAluno + " � " + media);
	     }	 
	}
}