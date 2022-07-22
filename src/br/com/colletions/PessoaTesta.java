package br.com.colletions;

import java.util.ArrayList;
import java.util.Scanner;

public class PessoaTesta {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		ArrayList<Pessoa> dados = new ArrayList<>();
		
		int idade = 0;
		int idadeMaior = idade;
		String nome = "";
		String nomeMaior = "";
		
		System.out.println("Os dados de quantas pessoas deseja adicionar a sua lista? ");
			int quantidadeDados = entrada.nextInt();
		
			for (int i = 0; i < quantidadeDados; i++) {
			System.out.print("Qual nome da pessoa? ");
			nome = entrada.next();
			entrada.nextLine();
			
			System.out.print("Qual a idade da pessoa? ");
			idade = entrada.nextInt();
			
			if (idade > idadeMaior) {
				idadeMaior = idade;
				nomeMaior = nome;
			} else {
				
			}
			
			dados.add(new Pessoa(nome, nomeMaior, idade, idadeMaior));
		
		}	
		System.out.println("A pessoa mais velha do grupo com " + idadeMaior + " anos, é " + nomeMaior);	
		System.out.println();
		for (Pessoa i : dados) {
				System.out.println(i);
		}
	entrada.close();
	}

}
