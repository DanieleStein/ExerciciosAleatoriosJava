package br.com.exerciciosaleatorios;

//1.Conta Corrente
//Cria uma classe para representar uma conta corrente que possui um número, um saldo,
//um status que informa se ela é especial ou não, um limite. Desenvolva métodos para
//realizar saque (verificando se o cliente pode realizar saques), depositar dinheiro, consultar
//saldo e verificar se o cliente está usando cheque especial ou não. Desenvolva um programa para testar essa classe.

public class ContaCorrente {
	
	int numero;
	double saldo;
	boolean especial;
	double limite;

	public boolean realizarSaque(double valorSaque) {
		boolean verificacao;
		
		if (this.saldo < valorSaque) {
			verificacao = false;
		} else {
			verificacao = true;
			this.saldo = this.saldo - valorSaque;
		}
		return verificacao;
	}
	
	public void depositarDinheiro(double valorDepositado) {
		this.saldo = this.saldo + valorDepositado;
	}
	
	public void consultarSaldo() {
		System.out.println("Saldo atual: " + this.saldo);
	}
	
	public void verificarEspecial() {
		if (this.especial) {
			System.out.println("Cliente usando cheque especial.");	
		} else {
			System.out.println("O cliente não está usando o cheque especial.");
		}
	}
}
