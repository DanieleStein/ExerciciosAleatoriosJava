package br.com.ForWhileDoWhile;

import java.util.Scanner;

public class VotoWhileIf {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade = 0;
		
		while (idade < 10) {
			System.out.print("Informe sua idade: ");
			idade = entrada.nextInt();
			
			if (idade >= 18 && idade < 70) {
				System.out.println("Seu voto é obrigatório!");
			} else if (idade >= 16) {
				System.out.println("Seu voto é opcional!");
			} else {
				System.out.println("Você não tem idade para votar!");
			}
		}
		entrada.close();
	}
	
	

}
