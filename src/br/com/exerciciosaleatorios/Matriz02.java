package br.com.exerciciosaleatorios;

import java.util.Scanner;

public class Matriz02 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double[][] notasAlunos = new double[2][4];
		
		for (int l = 0; l < notasAlunos.length; l++) {
			for (int c = 0; c < notasAlunos[l].length; c++) {
				System.out.printf("Informe a nota dos alunos [%d][%d]: " , l, c);
				notasAlunos[l][c] = entrada.nextDouble();
				
			}
			
			System.out.println();
		}
		
		for (int l = 0; l < notasAlunos.length; l++) {
			for (int c = 0; c < notasAlunos[l].length; c++) {
				System.out.print(notasAlunos[l][c] + " | ");
			
			}
			System.out.println();
			entrada.close();
		}
	}

}
