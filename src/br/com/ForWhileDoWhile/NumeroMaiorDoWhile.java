package br.com.ForWhileDoWhile;

import java.util.Scanner;

public class NumeroMaiorDoWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int c = 0;
		int i = 0;
		int maior = 0;
		
		do {
			System.out.print((c+1) + "º número: ");
			int numero1 = entrada.nextInt();
			c++; // incrementar para puxar 2º
			System.out.print((c+1) + "º número: ");
			int numero2 = entrada.nextInt();
			c = 0; // zerar para puxar 1º de novo
			
			
			maior = numero1 > numero2 ? numero1 : numero2;
			
			System.out.println("O número maior é: " + maior);
			
			i++;
			
		} while (i < 10);
		entrada.close();
	}

}
