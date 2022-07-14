package br.com.exerciciosaleatorios;

import java.util.Scanner;

public class NumeroMaiorIfElse {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int numero1 = entrada.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		int numero2 = entrada.nextInt();
		
		System.out.print("Digite o terceiro valor: ");
		int numero3 = entrada.nextInt();
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("Primeiro número informado "+ numero1 + ", tem o maior valor!");
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("Segundo número informado " + numero2 + ", tem o maior valor!");
		} else {
			System.out.println("Terceiro número informado " + numero3 + ", tem o maior valor!");
		}
		
		entrada.close();
	
	}
		
}
