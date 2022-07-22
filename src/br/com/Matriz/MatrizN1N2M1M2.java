package br.com.Matriz;

import java.util.Scanner;

//3.Escreve um programa que lê duas matrizes N1 (2,3) e N2(2,3) e cria:
//a)Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
//b)Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.

public class MatrizN1N2M1M2 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[][] matrizN1 = new int[2][3];
		
		int[][] matrizN2 = new int[2][3];
		
		int[][] matrizM1 = new int[2][3];
		
		int[][] matrizM2 = new int[2][3];
		
		
		for (int l = 0; l < matrizN1.length; l++) {
			for(int c = 0; c < matrizN1[l].length; c++) {
				System.out.printf("Matriz N1 [%d][%d]: " ,l,c, matrizN1[l][c]);
				matrizN1[l][c] = entrada.nextInt();	
			}
		}
		System.out.println();
		for (int l = 0; l < matrizN2.length; l++) {
			for (int c = 0; c < matrizN2[l].length; c++) {
				System.out.printf("Matriz N2 [%d][%d]: " ,l,c, matrizN2[l][c]);
				matrizN2[l][c] = entrada.nextInt();
			}
		}
		System.out.println();
		for (int l = 0; l < matrizM1.length; l++) {
			for (int c = 0; c < matrizM1[l].length; c++) {
				System.out.printf("\nMatriz M1 é a soma das matrizes N1 e N2 [%d][%d]: " ,l,c);
				matrizM1[l][c] = matrizN1[l][c] + matrizN2[l][c];
				System.out.print(matrizM1[l][c]);
			}
		}
		System.out.println();
		for (int l = 0; l < matrizM2.length; l++) {
			for (int c = 0; c < matrizM2[l].length; c++) {
				System.out.printf("\nMatriz M2 é a diferença das matrizes N1 e N2 [%d][%d]: " ,l,c);
				matrizM2[l][c] = matrizN1[l][c] - matrizN2[l][c];
				System.out.print(matrizM2[l][c]);
			}
		}
		entrada.close();
	}

}
