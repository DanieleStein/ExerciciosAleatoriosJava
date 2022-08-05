package br.com.exerciciosaleatorios;

import java.util.Scanner;

//Escreva um programa em Java que leia dois números inteiros e determine qual é o
//menor. Escreva um algoritmo que determina o maior também.

public class NumeroMaiorNumeroMenor {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o 1º número: ");
		int numero1 = entrada.nextInt();
		
		System.out.println("Informe o 2º número: ");
		int numero2 = entrada.nextInt();
		
		if (numero1 < numero2) {
			System.out.println("O número " + numero1 + " é o menor número!");
			System.out.println("O número " + numero2 + " é o maior número!");
		} else {
			System.out.println("O número " + numero2 + " é o menor número!");
			System.out.println("O número " + numero1 + " é o maior número!");
		}
	}
}
