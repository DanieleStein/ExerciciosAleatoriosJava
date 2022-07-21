package br.com.exerciciosaleatorios;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListaScannerTesta {
	
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	ArrayList<ArrayListaScanner> array = new ArrayList<>();
	
	System.out.println("Informe quantas entradas teremos: ");
	int quantidade = entrada.nextInt();
	
	for (int i = 0; i < quantidade; i++) {
		System.out.println("Informe o nome das pessoas: ");
		String nome = entrada.next();
		
		System.out.println("Informe a idade das pessoas: ");
		int idade = entrada.nextInt();
		
		System.out.println("Informe o salário das pessoas: ");
		double salario = entrada.nextDouble();
		
		
		array.add(new ArrayListaScanner(nome, idade, salario));
		
		
	}
	for (ArrayListaScanner i : array) {
		System.out.println(i);
	}
	entrada.close();
	}
	
}
