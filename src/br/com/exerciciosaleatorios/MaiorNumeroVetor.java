package br.com.exerciciosaleatorios;

import java.util.Scanner;

//1.Faça um programa que crie um vetor por leitura com 5 valores de pontuação
//de uma atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.

public class MaiorNumeroVetor {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] pontuacao = new int[5];
		int maiorPontuacao = pontuacao[0];// determino que o valor maior é o da posicao [0].
		
		System.out.println("Informe as pontuações da atividade!");
		for (int i = 0; i < pontuacao.length; i++) {
			System.out.print("Digite o " + (i+1) + "º ponto: ");
			pontuacao[i] = entrada.nextInt();
			
			if(pontuacao[i] > maiorPontuacao) { // se o [i] for maior que o da posicao [0] 
				maiorPontuacao = pontuacao[i];  // aqui ele vai substituir pelo maior numero
				
			}	
		}
		System.out.println("A maior pontuação é: " + maiorPontuacao);
		entrada.close();
	}
		
}



