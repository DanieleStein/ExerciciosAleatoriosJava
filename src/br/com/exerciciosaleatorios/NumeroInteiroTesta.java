package br.com.exerciciosaleatorios;

import java.util.Scanner;

public class NumeroInteiroTesta {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		NumeroInteiro n1 = new NumeroInteiro();
		
		System.out.print("Informe um número inteiro positivo: ");
		n1.numeroN = entrada.nextInt();
		
		n1.valorE = 0;

		
		n1.calcularNumero();
		
		System.out.println("Valor de E é: " + n1.valorE);
		
		entrada.close();
	}
	

}
