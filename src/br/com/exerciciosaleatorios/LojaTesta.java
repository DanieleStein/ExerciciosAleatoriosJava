package br.com.exerciciosaleatorios;

import java.util.ArrayList;
import java.util.Scanner;

public class LojaTesta {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Loja loja1 = new Loja();
		
		ArrayList<Loja> loja = new ArrayList<>();
		
		System.out.println("Quantas entradas seram informadas? ");
		int numeroItensLoja = entrada.nextInt();
		
		for (int i = 0; i < numeroItensLoja; i++) {
			System.out.println("Qual o nome do cliente? ");
			loja1.nomeCliente = entrada.next();
			entrada.nextLine();
			
			System.out.println("Qual item deseja comprar? ");
			loja1.produtos = entrada.next();
			entrada.nextLine();
			
			System.out.println("Valor do produto: ");
			loja1.valorProdutos = entrada.nextDouble();
			entrada.nextLine();
			
			System.out.println("O cliente " + loja1.nomeCliente + ", comprou o item " + loja1.produtos + " no valor de R$" + loja1.valorProdutos);
			
			if (loja1.nomeCliente.equals("dani")) {
				loja1.totalVendas += loja1.valorProdutos;
			} else {
				loja1.totalVendas += loja1.valorProdutos;
			}
			}
		
		if (loja1.nomeCliente.equals("dani")) {
			System.out.println(loja1.ANSI_GREEN + "O cliente " + loja1.nomeCliente + ", gastou um total de " + loja1.totalVendas + loja1.ANSI_RESET);
			System.out.println("==================================================");
		} else {
			System.out.println(loja1.ANSI_GREEN + "O cliente " + loja1.nomeCliente + ", gastou um total de " + loja1.totalVendas + loja1.ANSI_RESET);
			System.out.println("==================================================");
		}
		System.out.println(loja1.ANSI_GREEN + "Valor total da compra destes clientes R$" + loja1.totalVendas + loja1.ANSI_RESET);
	}
	
}
