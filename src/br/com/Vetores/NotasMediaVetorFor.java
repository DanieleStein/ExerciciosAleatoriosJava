package br.com.Vetores;

import java.util.Scanner;

public class NotasMediaVetorFor {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do Vetor: ");
		int tamanhoVetor = entrada.nextInt();
		
		double[] notas = new double[tamanhoVetor]; // ou o usuário definir o tamnho do vetor.
		//double[] notas = new double[5]; // podemos definir o tamnho do vetor.
		double soma = 0;
		double media = 0;
		 
		System.out.println("Informe as notas do aluno!");
		for (int i = 0; i < notas.length; i++) {
			System.out.print(i+1 + "º nota: ");
			notas[i] = entrada.nextDouble();
			soma = notas[i] + soma;
			media = soma / notas.length;
			
			
		}
		System.out.printf("A soma das notas é: %.2f\n" , soma);
		System.out.printf("A média das notas é: %.2f" , media);
		entrada.close();
	}

}
