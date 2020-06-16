package main;

import java.util.Scanner;

public class MenuPrincipal {
	
	public static void main(String[] args) {
		int op = 0;
		
		do {
			System.out.println("\nSistema de Notas");
			System.out.println("1 - Add Aluno");
			System.out.println("2 - Add Disciplina");
			System.out.println("3 - Adicionar Notas");
			System.out.println("4 - Calcular Médias");
			System.out.println("5 - Listar");
			System.out.println("6 - Sair");
			System.out.printf("Escolha a opção: ");
			Scanner read = new Scanner(System.in);		
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
					Listar();
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

	@SuppressWarnings("resource")
	private static void Listar() {
		Scanner read = new Scanner(System.in);		
		System.out.println("1- Listar Alunos ou 2- Listar Disciplinas: ");
		int x = Integer.parseInt(read.nextLine());
		
		if(x==1) {
			Aluno classeAlu = new Aluno();
			classeAlu.ListarAlunos();	
		}
		else if(x==2) {
			Disciplina classeDisciplina = new Disciplina();
			classeDisciplina.ListarDisciplinas();	
		}
	}

	@SuppressWarnings("resource")
	private static void CalcularMedias() {
		Scanner read = new Scanner(System.in);
		double nota1 = read.nextDouble();
		double nota2 = read.nextDouble();
		double nota3 = read.nextDouble();
		double media;
		media = (nota1 * 1 + nota2 * 2 + nota3 * 3) / 10;
		System.out.println("A média do Aluno é " + media);		
	}

	private static void AddDisciplina() {
		Scanner read = new Scanner(System.in);
		int codigoDisciplina;
		String nomeDisciplina;
        
		System.out.println("Cadastre o código da Disciplina: ");
		codigoDisciplina = Integer.parseInt(read.nextLine());		
		System.out.println("Digite o nome da Disciplina: ");
		nomeDisciplina = read.nextLine();

		Disciplina classeDisciplina = new Disciplina();
		classeDisciplina.AddDisciplinaInList(codigoDisciplina, nomeDisciplina);
	}

	@SuppressWarnings("resource")
	private static void AddAluno() {
		Scanner read = new Scanner(System.in);
		int matricula;
		String nomeAluno;
        
		System.out.println("Cadastre um Nro de matrícula para o Aluno: ");
        matricula = Integer.parseInt(read.nextLine());
		
		System.out.println("Digite o nome do Aluno: ");
        nomeAluno = read.nextLine();
        
		Aluno classeAlu = new Aluno();
		classeAlu.AddAluInList(matricula, nomeAluno);
		
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