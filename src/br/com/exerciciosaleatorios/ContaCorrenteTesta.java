package br.com.exerciciosaleatorios;

//1.Conta Corrente
//Cria uma classe para representar uma conta corrente que possui um número, um saldo,
//um status que informa se ela é especial ou não, um limite. Desenvolva métodos para
//realizar saque (verificando se o cliente pode realizar saques), depositar dinheiro, consultar
//saldo e verificar se o cliente está usando cheque especial ou não. Desenvolva um programa para testar essa classe.

import java.util.Scanner;

public class ContaCorrenteTesta {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		ContaCorrente minhaConta = new ContaCorrente();
		
		System.out.println("Digite o seu número: ");
		minhaConta.numero = entrada.nextInt();
		entrada.nextLine(); // todo dados numérico, boolean, caractere para limpar.
		
		System.out.println("Digite o seu saldo: ");
		minhaConta.saldo = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.println("Digite true caso a conta seja especial ou false para o contrário: ");
		minhaConta.especial = entrada.nextBoolean();
		entrada.nextLine();
		
		System.out.println("Digite o limite: ");
		minhaConta.limite = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.println("Digite um valor para saque: ");
		double valorSaque = entrada.nextDouble();
		entrada.nextLine();
		
		if (minhaConta.realizarSaque(valorSaque)) {
			System.out.println("Saque realizado com sucesso!");
			minhaConta.consultarSaldo();
		} else {
			System.out.println("Impossível realizar o saque!");
		}
		
		System.out.println("Digite o valor para depósito: ");
		double valorDepositado = entrada.nextDouble();
		entrada.nextLine();
		
		minhaConta.depositarDinheiro(valorDepositado);
		minhaConta.consultarSaldo();
		
		minhaConta.verificarEspecial();
	
		entrada.close();
	}
}
