package br.com.Vetores;

//2.Um dado é lançado 10 vezes e o valor correspondente é anotado.
//Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.
//A seguir determine e imprima a média aritmética dos lançamentos,
//contabilize e apresente também quantas foram as ocorrências da maior pontuação.

public class LancamentoDadoVetor {
	
	public static void main(String[] args) {
		
		int[] numerosDados = {2, 3, 6, 4, 5, 1, 6, 6, 3, 1};
		int somaNumeros = 0;
		int mediaNumeros = 0;
		int maiorNumero = numerosDados[0];
		int contadorVezes = 0;
		
		for (int i = 0; i < numerosDados.length; i++) {
			System.out.print(numerosDados[i] +" | ");
			somaNumeros = somaNumeros + numerosDados[i];
			mediaNumeros = somaNumeros / numerosDados.length;
			
			if (numerosDados[i] > maiorNumero) {
				maiorNumero = numerosDados[i];
			}
			
		}
		for (int i = 0; i < numerosDados.length; i++) {
			
			if (numerosDados[i] == maiorNumero) {
				contadorVezes++;
			}
		}
		
		System.out.println("\nA soma dos números do dado é " + somaNumeros + ", e a média é: " + mediaNumeros);
		System.out.println("O maior número do dado é " + maiorNumero + ", e ele se repete " + contadorVezes + " vezes.");
	}

}
