package br.com.exerciciosaleatorios;

public class Loja {
	
	String nomeCliente;
	String produtos;
	double valorProdutos;
	double totalVendas;
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_RED = "\u001B[31m";
	
	@Override
	public String toString() {
		return "Loja [nomeCliente=" + nomeCliente + ", produtos=" + produtos + ", valorProdutos=" + valorProdutos + "]";
	}
	
	
	
	
}

	

