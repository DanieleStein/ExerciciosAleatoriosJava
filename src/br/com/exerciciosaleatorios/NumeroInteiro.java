package br.com.exerciciosaleatorios;

//2.Faça um programa que leia um valor N inteiro e positivo, calcule e mostre o valor de
//E, conforme a fórmula a seguir:
//E = 1 + 1! + 1 + 2! + 1 + 3! + ... + 1/N!

public class NumeroInteiro {
	
	
	static int numeroN, valorE, contador;
	
	
	public static void calcularNumero() {
		
		for(int i = 1; i <= numeroN; i++) {
			contador++;
			valorE = valorE + (1 + contador);
			
			
		}
		
		
	}

}
