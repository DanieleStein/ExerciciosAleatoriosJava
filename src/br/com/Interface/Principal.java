package br.com.Interface;

public class Principal {
	
	public static void main(String[] args) {
		
		Fuzil fuzil = new Fuzil();
		fuzil.atirar();
		fuzil.recarregar();
		
		Pistola pistola = new Pistola();
		pistola.atirar();
		pistola.recarregar();
	}

}
