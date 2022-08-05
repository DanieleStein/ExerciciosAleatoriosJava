package br.com.exerciciosaleatorios;

import java.util.Scanner;

//Implemente o programa da calculadora utilizando uma instrução switch-case para
//determinar a operação que deve ser executada, conforme o usuário escolhe no menu
//de opções. Conforme a opção escolhida pelo usuário, um diferente método da
//calculadora é executado. Por exemplo: digamos que a opção esteja associada ao
//método somar(op1, op2), então será executado este método da calculadora, e o
//resultado obtido será a soma dos operandos 1 e 2.

public class Calculadora {
	
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_GREEN = "\u001B[32m";
	private static final String ANSI_RED = "\u001B[31m";
	
	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Informe o 1º número que deseja calcular: ");
	double numero1 = entrada.nextDouble();
	
	System.out.println("Informe o 2º número que deseja calcular: ");
	double numero2 = entrada.nextDouble();
	
	System.out.println("Informe qual operação matemática deseja realizar: ");
	char operacao = entrada.next().charAt(0);
	
	switch(operacao) {
	case '+':
		System.out.println(ANSI_GREEN + "O total da soma do 1º com o 2º número é de " + (numero1 + numero2) + ANSI_RESET);
		break;
	case '-':
		System.out.println(ANSI_GREEN + "O total da subtração do 1º com o 2º número é de " + (numero1 - numero2) + ANSI_RESET);
		break;
	case '*':
		System.out.println(ANSI_GREEN + "O total da multiplicação do 1º com o 2º número é de " + (numero1 * numero2) + ANSI_RESET);
		break;
	case '/':
		System.out.println(ANSI_GREEN + "O total da divisão do 1º com o 2º número é de " + (numero1 / numero2) + ANSI_RESET);
		break;
	case '%':
		System.out.println(ANSI_GREEN + "O total do resto da divisão do 1º com o 2º número é de " + (numero1 % numero2) + ANSI_RESET);
		break;
	default:
		System.out.println(ANSI_RED + "Opção inválida, tente novamente!" + ANSI_RESET);
		break;
	}
	}
}
