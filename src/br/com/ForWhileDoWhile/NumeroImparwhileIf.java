package br.com.ForWhileDoWhile;


public class NumeroImparwhileIf {
	
	public static void main(String[] args) {
		
		
		int impares = 0;
		int contador = 0;
		
		while (contador <= 10) {
			if (contador % 2 != 0) {
				impares++;
			}
			
			contador++;
		}
		System.out.println("Números impares são: " + impares);
	}
		
}
