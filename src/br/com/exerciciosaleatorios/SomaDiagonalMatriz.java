package br.com.exerciciosaleatorios;

import java.util.Scanner;

//4.Crie um programa que receba valores do usuário para preencher uma matriz 3X3,
//e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal,
//ou seja, diagonal principal.

public class SomaDiagonalMatriz {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[][] valores = new int[3][3];
		int somaValores = 0;
		int somaDiagonal = 0;
		
		
		for (int l = 0; l < valores.length; l++) {
			for (int c = 0; c < valores[l].length; c++) {
				System.out.printf("Informe os valores para matriz [%d][%d]: ", l , c);
				valores[l][c] = entrada.nextInt();
				somaValores = somaValores + valores[l][c];
				//somaDiagonal = valores[0][0] + valores[1][1] + valores[2][2];// ou a soma da diagonal, pode ser feita dessa forma, sem if.
				
				if (l == c) {
					somaDiagonal = somaDiagonal + valores[l][c];
				}
				
			}
			System.out.println();
		}
		entrada.close();
		for (int l = 0; l < valores.length; l++) {
			for (int c = 0; c < valores[l].length; c++) {
				System.out.print(valores[l][c] + " | ");
				
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("A soma dos valores da nossa matriz é " + somaValores + "!");
		System.out.println("A soma da diagonal da matriz é "+ somaDiagonal + "!");
	}

}
