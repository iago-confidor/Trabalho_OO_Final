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
			System.out.println("4 - Calcular Médias");
			System.out.println("5 - Listar");
			System.out.println("6 - Sair");
			System.out.printf("Escolha a opção: ");
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
					System.out.println("Você saiu do sistema!");
					break;
					
				default:
					System.out.println("Opção inválida! Digite uma opção válida \n");
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
	            // recebe a 1º nota
	            System.out.println("Aluno " + contAluno + ", digite sua 1ª nota");
	            nota1 = read.nextInt();
	            
	            // recebe a 2º nota
	            System.out.println("Aluno " + contAluno + ", digite sua 2ª nota");
	            nota2 = read.nextInt();
	            
	            // recebe a 3º nota
	            System.out.println("Aluno " + contAluno + ", digite sua 3ª nota");
	            nota3 = read.nextInt();
	            
	            // calcula a média
	            media = (nota1 + nota2 + nota3) / 3;
	            System.out.println("A média do aluno " + contAluno + " é " + media);
	     }	 
	}
}