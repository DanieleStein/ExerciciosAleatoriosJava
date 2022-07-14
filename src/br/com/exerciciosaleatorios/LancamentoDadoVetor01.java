package br.com.exerciciosaleatorios;

import java.util.Scanner;

//2.Um dado é lançado 10 vezes e o valor correspondente é anotado.
//Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.
//A seguir determine e imprima a média aritmética dos lançamentos,
//contabilize e apresente também quantas foram as ocorrências da maior pontuação.

public class LancamentoDadoVetor01 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] numeroDado = new int[10];
		int somaDado = 0;
		int mediaDado = 0;
		int numeroMaior = numeroDado[0];
		int contador = 0;
		
		System.out.println("Informe o valor dos dados!");
		for (int i = 0; i < numeroDado.length; i++) {
			numeroDado[i] = entrada.nextInt();
			somaDado = somaDado + numeroDado[i];
			mediaDado = somaDado / numeroDado.length;
			
			if (numeroDado[i] > numeroMaior) {
				numeroMaior = numeroDado[i];
			}
		}
		entrada.close();
		for (int i = 0; i < numeroDado.length; i++) {
			if(numeroDado[i] == numeroMaior) {
				contador++;
			}
		}
		
		System.out.println("A soma dos números do dado é " + somaDado + ", e a média é " + mediaDado + ".");
		System.out.println("O número maior do dado foi " + numeroMaior + ", e ele se repetiu " + contador + " vezes.");
	}

}
