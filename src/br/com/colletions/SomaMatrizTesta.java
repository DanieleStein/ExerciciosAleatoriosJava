package br.com.colletions;


import java.util.Scanner;

public class SomaMatrizTesta {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		SomaMatriz matr1 = new SomaMatriz();

		
		for (int l = 0; l < matr1.salarioM1.length; l++) {
			for (int c = 0; c < matr1.salarioM1[l].length; c++) {
				System.out.printf("Informe os salários da MatrizM1 [%d][%d]: " , l, c, matr1.salarioM1[l][c]);
				matr1.salarioM1[l][c] = entrada.nextDouble();
			}
		}
		System.out.println();
		
		for (int l = 0; l < matr1.salarioM2.length; l++) {
			for (int c = 0; c < matr1.salarioM2[l].length; c++) {
				System.out.printf("Informe os salários da MatrizM2 [%d][%d]: ", l, c, matr1.salarioM2[l][c]);
				matr1.salarioM2[l][c] = entrada.nextDouble();
			}
		}
		System.out.println();
		
		for (int l = 0; l < matr1.somaM1M2.length; l++) {
			for (int c = 0; c < matr1.somaM1M2[l].length; c++) {
				System.out.printf("Matriz M1M2 é a soma da Matriz M1 e M2 [%d][%d]: " , l, c, matr1.somaM1M2[l][c]);
				matr1.somaM1M2[l][c] = matr1.salarioM1[l][c] + matr1.salarioM2[l][c];
				System.out.println(matr1.somaM1M2[l][c]);
			}
		}
		entrada.close();
	}
	
}
