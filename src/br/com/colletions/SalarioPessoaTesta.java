package br.com.colletions;

import java.util.ArrayList;
import java.util.Scanner;

public class SalarioPessoaTesta {
	
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	ArrayList<SalarioPessoa> array = new ArrayList<>();
	
	System.out.println("Informe quantas entradas teremos: ");
	int quantidade = entrada.nextInt();
	
	for (int i = 0; i < quantidade; i++) {
		System.out.print("Informe o nome das pessoas: ");
		String nome = entrada.next();
		
		System.out.print("Informe a idade das pessoas: ");
		int idade = entrada.nextInt();
		
		System.out.print("Informe o salário das pessoas: ");
		double salario = entrada.nextDouble();
		
		salario = salario * 3;
		System.out.printf("Seu sálario multiplicado por 3, teria o total de %.2f. \n" , salario);
		if (salario > 100) {
			System.out.println(nome + " seu sálario é maior de R$ 100,00 reais.");
		} else if (salario < 100) {
			System.out.println(nome + " seu sálario é menor que R$ 100,00 reais.");
		}
		
		if (idade > 50) {
			System.out.println(nome + " sua idade é maior que 50 anos.");
		} else if (idade <50) {
			System.out.println(nome + " sua idade é menor que 50 anos.");
		}
		
		System.out.println();
		
		array.add(new SalarioPessoa(nome, idade, salario));
		
	}
	for (SalarioPessoa i : array) {
		System.out.println(i);
	}
	entrada.close();
	}
	
}
