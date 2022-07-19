package br.com.exerciciosaleatorios;

//1.Um funcionário de uma empresa recebe aumento salarial anualmente. Sabe-se que:
//a)Esse funcionário foi contratado em 1995, com o salário inicial de R$1000,00;
//b)Em 1996 recebeu um aumento de 1,5% sobre o seu salário inicial;
//c)A partir de 1997 (inclusive), os aumentos salariais sempre corresponderam ao
//dobro do percentual do ano anterior.
//Faça um programa que determine o salário atual desse funcionário.

public class SalarioFuncionário {
	
	static double salarioFunc = 1000;
	static double aumentoSalario = 1.5 / 100;
	static int ano;
	
	public static void main(String[] args) {
		
		calcularSalario();
		System.out.printf("O salário no ano de " + ano +  " é de R$ %.2f" , salarioFunc);

	}
	
	public static void calcularSalario() {
		
		for (int i = 1996; i <= 2022; i++) {
			ano = i;
			salarioFunc += aumentoSalario;
			aumentoSalario = aumentoSalario * 2;
			
		}
	}
}

