package br.com.exerciciosaleatorios;

import java.util.Scanner;

//Realize um programa que peça uma nota de 0 e 10. Mostre uma mensagem caso o
//valor seja inválido e continue pedindo caso o valor seja válido.

public class Numeros0a10 {
	
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_RED = "\u001B[31m";
	private int numeros;

	public Numeros0a10(int numeros) {
		super();
		this.numeros = numeros;
	}

	public int getNumeros() {
		return numeros;
	}

	public void setNumeros(int numeros) {
		this.numeros = numeros;
	}
	
	public void contador() {
		Scanner entrada = new Scanner(System.in);
		
			do {
				System.out.println("Informe uma nota de 0 a 10: ");
				numeros = entrada.nextInt();
			} while(numeros >= 0 && numeros <= 10);
			System.out.println(ANSI_RED + "Número inválido!" + ANSI_RESET);
	}
}
