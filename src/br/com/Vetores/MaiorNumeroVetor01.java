package br.com.Vetores;

import java.util.Scanner;

//1.Faça um programa que crie um vetor por leitura com 5 valores de pontuação
//de uma atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.

public class MaiorNumeroVetor01 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] pontuacao = new int[5];
		int pontuacaoMaior = pontuacao[0];
		
		System.out.println("Informe as pontuações!");
		for (int i = 0; i < pontuacao.length; i++) {
			System.out.print(i+1 + "º pontuação: ");
			pontuacao[i] = entrada.nextInt();
			
			if (i == 0) { // se o i for igual a 0, pontuacao maior já vai receber a primeira posicao
				pontuacaoMaior = pontuacao[i];
			} else if (pontuacao[i] > pontuacaoMaior) { // se a pontuacao[i] foi maior que o valor que esta na primeira posicao
				pontuacaoMaior = pontuacao[i]; // ele vai jogar a maior pontuacao para o maior.
			} else {
				
			}
		}
		System.out.println("A pontuação maior é: " + pontuacaoMaior);
		entrada.close();
	}

}
