package br.com.exerciciosaleatorios;

//Faça um programa que mostre a soma de todos os números no intervalo de 1 até 100.

public class SomaNumeros1a100 {
	
	public static void main(String[] args) {
		
		int numeros = 0;
		int somaNumeros = 0;
		
		do {
			somaNumeros = somaNumeros + numeros;
			numeros ++;
		} while (numeros <=100);
		System.out.println("A soma dos números de 1 a 100 é de " + somaNumeros);
	}
}
