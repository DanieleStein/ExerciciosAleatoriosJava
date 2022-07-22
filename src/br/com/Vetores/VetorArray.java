package br.com.Vetores;

public class VetorArray {
	
	public static void main(String[] args) {
		
		int[] numeros = new int[10];
		
		int x = 30;
		
		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = x;
		numeros[3] = 40;
		numeros[4] = 50;
		numeros[5] = 60;
		numeros[6] = 70;
		numeros[7] = 80;
		numeros[8] = 90;
		numeros[9] = 100;
		
		int y = numeros[4];
	
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("A posicão " + i + " tem o número: " + numeros[i]);
		}
		System.out.println("A variavel y: " + y);
	}

}
