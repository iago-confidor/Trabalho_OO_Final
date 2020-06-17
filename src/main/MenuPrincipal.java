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
			@SuppressWarnings("resource")
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
	private static void CalcularMedias() {
		
	}
	
	@SuppressWarnings("resource")
	private static void AddAluno() {
		Scanner read = new Scanner(System.in);
		int matricula;
		String nomeAluno;
        
		System.out.println("Cadastre Nro de matrícula para o Aluno: ");
        matricula = Integer.parseInt(read.nextLine());
		
		System.out.println("Digite o nome do Aluno: ");
        nomeAluno = read.nextLine();
        
		Aluno classeAlu = new Aluno();
		classeAlu.AddAluInList(matricula, nomeAluno);
		
	}

	@SuppressWarnings("resource")
	private static void AddDisciplina() {
		Scanner read = new Scanner(System.in);
		int codigoDisciplina;
		String nomeDisciplina;
		String tipoDisciplina=null;
        
		System.out.println("Cadastre o código da Disciplina: ");
		codigoDisciplina = Integer.parseInt(read.nextLine());		
		System.out.println("Digite o nome da Disciplina: ");
		nomeDisciplina = read.nextLine();
		System.out.println("\n(Digite o número)\nTipo de disciplina: \n1-Prática\n2-Teórica\n");
		int x = Integer.parseInt(read.nextLine());	
		if(x==1 || x==2) {
			if(x==1) tipoDisciplina = "Prática";
			else if(x==2) tipoDisciplina = "Teórica";
		Disciplina classeDisciplina = new Disciplina();
		classeDisciplina.AddDisciplinaInList(codigoDisciplina, nomeDisciplina, tipoDisciplina);
		}else {
			System.out.println("Valor Digitado Incorretamente!");
		}
	}
	
	@SuppressWarnings("resource")
	private static void AddNotas() {
		int matricula;

		Scanner read = new Scanner(System.in);
		System.out.println("Digite o código da Disciplina: ");
        int codigoDisciplina = Integer.parseInt(read.nextLine());	        
		Disciplina classeDisciplina = new Disciplina();
		
		if(classeDisciplina.SelectDisciplina(codigoDisciplina) !=  null) {
			System.out.println("Digite a matrícula do Aluno: ");
			matricula = Integer.parseInt(read.nextLine());
			
			Aluno classeAlu = new Aluno();
			if(classeAlu.SelectAluno(matricula) != null) {
				if(classeDisciplina.SelectTipoDisciplina(codigoDisciplina).equals("Prática")) {
					NotaAvaliacaoPratica notaP = new NotaAvaliacaoPratica();
					
					int p1, p2;
					System.out.println("Digite a nota da P1: ");
					p1 = Integer.parseInt(read.nextLine());
					
					System.out.println("Digite a nota da P2: ");
					p2 = Integer.parseInt(read.nextLine());
					
					notaP.AddNotasInList(matricula, classeAlu.SelectAluno(matricula), codigoDisciplina, 
							classeDisciplina.SelectDisciplina(codigoDisciplina), p1, p2);
				}
				else if(classeDisciplina.SelectDisciplina(codigoDisciplina).equals("Teórica")) {
					NotaAvaliacaoTeorica notaT = new NotaAvaliacaoTeorica();
					int t1, t2, t3;
					
					System.out.println("Digite a nota da T1: ");
					t1 = Integer.parseInt(read.nextLine());
					
					System.out.println("Digite a nota da T2: ");
					t2 = Integer.parseInt(read.nextLine());
					
					System.out.println("Digite a nota da T3: ");
					t3 = Integer.parseInt(read.nextLine());
					
					notaT.AddNotasInList(matricula, classeAlu.SelectAluno(matricula), codigoDisciplina, 
							classeDisciplina.SelectDisciplina(codigoDisciplina), t1, t2, t3);
				}
			}
			else {
				System.out.println("Matrícula Inválida!!");
			}	
		} else {
			System.out.println("Codigo da Disciplina Inválido!!");
		}		
	}
	
	@SuppressWarnings("resource")
	private static void Listar() {
		Scanner read = new Scanner(System.in);		
		System.out.println("\n1- Listar Alunos \n2- Listar Disciplinas\n3- Listar Notas\n4-Medias: ");
		int x = Integer.parseInt(read.nextLine());
		
		if(x==1) {
			Aluno classeAlu = new Aluno();
			classeAlu.ListarAlunos();	
		}
		else if(x==2) {
			Disciplina classeDisciplina = new Disciplina();
			classeDisciplina.ListarDisciplinas();	
		}
		else if(x==3) {
			NotaAvaliacaoTeorica classeTeorica = new NotaAvaliacaoTeorica();
			classeTeorica.ListarTeoricas();
			
			NotaAvaliacaoPratica classePratica = new NotaAvaliacaoPratica();
			classePratica.ListarPraticas();
		}
	}
}

