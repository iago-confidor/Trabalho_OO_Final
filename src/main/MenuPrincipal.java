package main;

import java.util.Scanner;

public class MenuPrincipal {

	@SuppressWarnings("resource")
	
	public static void main(String[] args) {
		int op = 0;
		do {
			Scanner read = new Scanner(System.in);		
			System.out.println("Sistema de Notas");
			System.out.println("01 - Add Aluno");
			System.out.println("02 - Add Aluno");
			System.out.println("03 - Adicionar Notas");
			System.out.println("04 - Calcular Médias");
			System.out.println("05 - Listar");
			System.out.println("05 - Sair");



			System.out.printf("Escolha a opção: ");
			op = read.nextInt();
			
		} while(op==4);
	
	}
}