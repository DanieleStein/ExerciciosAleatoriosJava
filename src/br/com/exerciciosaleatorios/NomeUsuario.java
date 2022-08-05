package br.com.exerciciosaleatorios;

import java.util.Scanner;

//Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha
//igual o nome de usuário, mostrando uma mensagem de erro voltando para pedir
//informações.

public class NomeUsuario {
	
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_RED = "\u001B[31m";
	private static final String ANSI_GREEN = "\u001B[32m";
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Informe o nome de usuário: ");
		String nome = entrada.next();
		
		System.out.println("Informe a sua senha: ");
		String senha = entrada.next();
	
		if (nome.equals(senha)) {
			System.out.println(ANSI_RED + "Usuário e senha inválidos! Solicite informações!" + ANSI_RESET);	
		} else {
			System.out.println(ANSI_GREEN + "Usuário e senha autenticados com sucesso!" + ANSI_RESET);
		} 
	}
}
