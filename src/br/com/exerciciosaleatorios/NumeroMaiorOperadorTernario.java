package br.com.exerciciosaleatorios;

import java.util.Scanner;

public class NumeroMaiorOperadorTernario {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int numero1 = entrada.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int numero2 = entrada.nextInt();
		
		int maior = 0;
		
		maior = numero1 > numero2 ? numero1 : numero2;
		
		System.out.println("Maior valor é: " + maior);
		
		entrada.close();
		
		
	}

}
