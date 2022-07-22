package br.com.Matriz;

//3.Escreve um programa que lê duas matrizes N1 (2,3) e N2(2,3) e cria:
//a)Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
//b)Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.

public class MatrizN1N2 {
	
	public static void main(String[] args) {
		
		int[][] matrizN1 = new int[2][3];
		matrizN1 [0][0] = 6;
		matrizN1 [0][1] = 7;
		matrizN1 [0][2] = 8;
		matrizN1 [1][0] = 9;
		matrizN1 [1][1] = 5;
		matrizN1 [1][2] = 4;
		
		int[][] matrizN2 = new int[2][3];
		matrizN2 [0][0] = 1;
		matrizN2 [0][1] = 2;
		matrizN2 [0][2] = 3;
		matrizN2 [1][0] = 9;
		matrizN2 [1][1] = 8;
		matrizN2 [1][2] = 7;
		
		int[][] matrizM1 = new int[2][3];
		matrizM1 [0][0] = matrizN1 [0][0] + matrizN2 [0][0];
		matrizM1 [0][1] = matrizN1 [0][1] + matrizN2 [0][1];
		matrizM1 [0][2] = matrizN1 [0][2] + matrizN2 [0][2];
		matrizM1 [1][0] = matrizN1 [1][0] + matrizN2 [1][0];
		matrizM1 [1][1] = matrizN1 [1][1] + matrizN2 [1][1];
		matrizM1 [1][2] = matrizN1 [1][2] + matrizN2 [1][2];
		
		int[][] matrizM2 = new int[2][3];
		matrizM2 [0][0] = matrizN1 [0][0] - matrizN2[0][0];
		matrizM2 [0][1] = matrizN1 [0][1] - matrizN2[0][1];
		matrizM2 [0][2] = matrizN1 [0][2] - matrizN2[0][2];
		matrizM2 [1][0] = matrizN1 [1][0] - matrizN2[1][0];
		matrizM2 [1][1] = matrizN1 [1][1] - matrizN2[1][1];
		matrizM2 [1][2] = matrizN1 [1][2] - matrizN2[1][2];
	
		
		for (int l = 0; l < matrizN1.length; l++) {
			for(int c = 0; c < matrizN1[l].length; c++) {
				System.out.printf("Matriz N1 [%d][%d]: " ,l,c); // mostra as matrizes.
				System.out.println(matrizN1[l][c]);       // mostra os valores dentro da matriz.
			}
		}
		System.out.println();
		for (int l = 0; l < matrizN2.length; l++) {
			for (int c = 0; c < matrizN2[l].length; c++) {
				System.out.printf("Matriz N2 [%d][%d]: " ,l,c);
				System.out.println(matrizN2[l][c]);
			}
		}
		System.out.println();
		for (int l = 0; l < matrizM1.length; l ++) {
			for (int c = 0; c < matrizM1[l].length; c++) {
				System.out.printf("Matriz M1 é a soma das matrizes N1 e N2 [%d][%d]: " ,l,c);
				System.out.println(matrizM1[l][c]);
				
			}
		}
		System.out.println();
		for (int l = 0; l < matrizM2.length; l++) {
			for (int c = 0; c < matrizM2[l].length; c++) {
				System.out.printf("Matriz M2 é a diferença das matrizes N1 e N2 [%d][%d] " ,l,c);
				System.out.println(matrizM2[l][c]);
			}
		}
		System.out.println();
	}

}
