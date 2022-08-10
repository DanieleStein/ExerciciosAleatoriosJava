package br.com.dicionariosListaConjuntos;

import java.util.ArrayList;

//Definir e inicializar uma nova lista vazia. Adicionar os seguintes elementos à lista vazia: 1,5,5,6,7,8,8,8.
//Imprimir o resultado na tela.

public class ListaNumeros {
	
	public static void main(String[] args) {
		
		//Lista é uma coleção de dados do mesmo tipo, em que a ordem é importante e pode haver repetições.
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(1);
		numeros.add(5);
		numeros.add(5);
		numeros.add(6);
		numeros.add(7);
		numeros.add(8);
		numeros.add(8);
		numeros.add(8);
		numeros.add(8);
		
		System.out.println("Minha lista de números: " + numeros);	
	}
}
