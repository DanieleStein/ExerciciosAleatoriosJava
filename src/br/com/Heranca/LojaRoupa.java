package br.com.Heranca;

public class LojaRoupa extends Loja {

	int quantCalcas;
	int quantBlusas;
	int totalPecas;
	
	public void calcularPecas() {
		totalPecas = quantCalcas + quantBlusas;
		System.out.println("Quantidade total de blusas e calças na loja de roupa é de: " + totalPecas);
	}
	
}
