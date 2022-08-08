package br.com.Interface;

public class Fuzil implements Jogador {

	@Override
	public void recarregar() {
		double tempoRecarregar = 0.10;
		System.out.println("No fuzil, o jogador demora cerca de " + tempoRecarregar + " segundos para recarregar.");
	}

	@Override
	public void atirar() {
		int quantidadeTiros = 3;
		int quantidadeMunicaoTiro = 4;
		int totalMunicaoTiro = quantidadeTiros * quantidadeMunicaoTiro;
		System.out.println("Um fuzil deu um total de " + quantidadeTiros + " tiros, e a cada tiro ele gasta um total de " + quantidadeMunicaoTiro + " munições. O total de munição usado hoje foi de " + totalMunicaoTiro + ".");
	}

}
