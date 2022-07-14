package br.com.exerciciosaleatorios;

import java.util.Scanner;

public class NumerosParesFor {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int pares = 0;
		
		System.out.println("Informe 10 números: ");
		for (int i = 1; i <= 10; i++) {
			int numeros = entrada.nextInt();
			
			if (numeros % 2 == 0 ? true : false) {
				pares++;
				
			}
		}
		System.out.println("A quantidade de números pares é: " + pares);
		entrada.close();
	}
	
}
