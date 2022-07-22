package br.com.ForWhileDoWhile;

import java.util.Scanner;

public class SomaDoWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int i = 0;
		
		do {
			System.out.print("Informe um número: ");
			int numero1 = entrada.nextInt();
			
			System.out.print("Informe um número: ");
			int numero2 = entrada.nextInt();
			
			if(numero2 == 0) {
				System.out.println("Número 0, não é divisível, insira novos número!");
				continue;
			}
			
			System.out.println("A divisão dos números " + numero1 + " e " + numero2 + " é: " + (numero1 / numero2));
			
			i++;
			
		} while (i < 5);
		entrada.close();
	}

}
