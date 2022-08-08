package br.com.Interface;

public class Pistola implements Jogador{

	@Override
	public void atirar() {
		int quantidadeTiros = 5;
		int quantidadeMunicaoTiro = 2;
		int totalMunicaoTiro = quantidadeTiros * quantidadeMunicaoTiro;
		System.out.println("Uma pistola deu um total de " + quantidadeTiros + " tiros, e a cada tiro ele gasta um total de " + quantidadeMunicaoTiro + " munições. O total de munição usado hoje foi de " + totalMunicaoTiro + ".");
	}

	@Override
	public void recarregar() {
		double tempoRecarregar = 0.5;
		System.out.println("Na pistola, o jogador demora cerca de " + tempoRecarregar + " segundos para recarregar.");
	}

}
