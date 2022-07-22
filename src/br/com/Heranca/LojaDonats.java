package br.com.Heranca;

public class LojaDonats extends Loja {
	
	int quantDonats;
	int donatsPreto;
	int donatsBranco;

	public void calcularPecas() {
		quantDonats = donatsPreto + donatsBranco;
		System.out.println("Quantidade total de donats brancos e pretos na loja de Donats é de: " + quantDonats);
	}

}
