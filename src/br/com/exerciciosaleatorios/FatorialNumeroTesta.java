package br.com.exerciciosaleatorios;

import java.util.Scanner;

public class FatorialNumeroTesta {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numeros = 0;
		
		System.out.print("Informe a quantidade de números que deseja saber o fatorial: ");
		int quantidadeNum = entrada.nextInt();	
		
		System.out.println("Informe os números que deseja saber o fatorial: ");
		for (int c = 1; c <= quantidadeNum; c++) {
			numeros = entrada.nextInt();
		
		int fatorial = 1;
		for (int i = 1; i <= numeros; i++) {
			fatorial = fatorial * i;
		}
			
		System.out.println("O fatorial do número " + numeros + " é: " + fatorial);
		
	    }
		entrada.close();
	}	
}