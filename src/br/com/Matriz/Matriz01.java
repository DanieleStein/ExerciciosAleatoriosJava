package br.com.Matriz;

public class Matriz01 {
	
	public static void main(String[] args) {
		
		double[][] notasAlunos = new double [2][4];
		
		notasAlunos[0][0] = 7.8;
		notasAlunos[0][1] = 8.9;
		notasAlunos[0][2] = 4.7;
		notasAlunos[0][3] = 9.5;
		
		notasAlunos[1][0] = 7.8;
		notasAlunos[1][1] = 6.7;
		notasAlunos[1][2] = 9.4;
		notasAlunos[1][3] = 8.5;
		
		for (int l = 0; l < notasAlunos.length; l++) {
			for (int c = 0; c < notasAlunos[l].length; c++) {
				System.out.print(notasAlunos[l][c] + " | ");
				
			}
			System.out.println(); // para quebrar a linha e aparecer como matriz.
			
		}
	}

}
