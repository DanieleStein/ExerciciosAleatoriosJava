package br.com.dicionariosListaConjuntos;

import java.util.HashSet;
import java.util.Set;

//Definir e inicializar um novo conjunto vazio. Adicionar os seguintes elementos ao conjunto vazio: 1,5,5,6,7,8,8,8.
//Imprimir o resultado na tela. Qual é a diferença entre este exercício e o anterior?

public class ConjuntoNumeros {
	
	public static void main(String[] args) {
		
		//Em conjunto se houver números repetidos, eles não serão impressos.
		//Ele é uma coleção de dados do mesmo tipo, a ordem não importa, e não pode haver números repetidos.
		Set<Integer> conjunto = new HashSet<>();
		
		conjunto.add(1);
		conjunto.add(5);
		conjunto.add(5);
		conjunto.add(6);
		conjunto.add(7);
		conjunto.add(8);
		conjunto.add(8);
		conjunto.add(8);
		
		System.out.println("Meu conjunto de números: " + conjunto);	
	}
}
