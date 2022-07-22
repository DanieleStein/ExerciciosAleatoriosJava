package br.com.Heranca;

import java.util.Scanner;

public class TestaLojas {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		LojaRoupa roupa = new LojaRoupa();
		
		roupa.nome = "Roupa Show";
		System.out.println("Nome loja: " + roupa.nome);
		roupa.endereco = "Rua Banana";
		System.out.println("Endereço da loja: " + roupa.endereco);
		roupa.tipoLoja = "Roupa";
		System.out.println("Qual tipo de loja: " + roupa.tipoLoja);
		
		System.out.print("Qual a quantidade de calças da loja? ");
		roupa.quantCalcas = entrada.nextInt();
		System.out.print("Qual a quantidade de blusas da loja? ");
		roupa.quantBlusas = entrada.nextInt();
		
		roupa.calcularPecas();
		System.out.println();
		
		
		LojaDonats donats = new LojaDonats();
		
		donats.nome = "Donats Bom";
		System.out.println("Nome loja: " + donats.nome);
		donats.endereco = "Rua Verde";
		System.out.println("Endereço da loja: " + donats.endereco);
		donats.tipoLoja = "Alimentos";
		System.out.println("Qual tipo de loja: " + donats.tipoLoja);
		
		System.out.print("Qual a quantidade de donats pretos da loja? ");
		donats.donatsPreto = entrada.nextInt();
		System.out.print("Qual a quantidade de donats brancos da loja? ");
		donats.donatsBranco = entrada.nextInt();
		
		donats.calcularPecas();
		System.out.println();
	}

}
