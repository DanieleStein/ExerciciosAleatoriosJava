package br.com.colletions;

import java.util.Scanner;

public class SomaMatrizTesta {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double[][] salarioM1 = new double[3][3];
		double[][] salarioM2 = new double[3][3];
		double[][] somaM1M2 = new double[3][3];
		
		for (int l = 0; l < salarioM1.length; l++) {
			for (int c = 0; c < salarioM1[l].length; c++) {
				System.out.printf("Informe os salários da MatrizM1 [%d][%d]: " , l, c, salarioM1[l][c]);
				salarioM1[l][c] = entrada.nextDouble();
			}
		}
		System.out.println();
		
		for (int l = 0; l < salarioM2.length; l++) {
			for (int c = 0; c < salarioM2[l].length; c++) {
				System.out.printf("Informe os salários da MatrizM2 [%d][%d]: ", l, c, salarioM2[l][c]);
				salarioM2[l][c] = entrada.nextDouble();
			}
		}
		System.out.println();
		
		for (int l = 0; l < somaM1M2.length; l++) {
			for (int c = 0; c < somaM1M2[l].length; c++) {
				System.out.printf("Matriz M1M2 é a soma da Matriz M1 e M2 [%d][%d]: " , l, c, somaM1M2[l][c]);
				somaM1M2[l][c] = salarioM1[l][c] + salarioM2[l][c];
				System.out.println(somaM1M2[l][c]);
			}
		}	
	}
}
