package br.com.dicionariosListaConjuntos;

//Criar um dicionário que represente os primeiros 5 números da “Loteria dos Sonhos”, junto com seu significado. 
//Para isso, o dicionário deverá ter como chave Integer e como valor uma String.
//Números da Loteria dos Sonhos:
//0→Ovo /1→Água /2 → Escopeta /3 → Cavalo /4 → Dentista /5→Fogo

import java.util.HashMap;
import java.util.Map;

public class DicionarioLoteriaSonhos {
	
	public static void main(String[] args) {
		
		//Dicionario é uma colecao de dados que existe uma chave e um valor, através das chaves, é possível pegar o valor.
		Map<Integer, String> dicionario = new HashMap<>();
		
		dicionario.put(0, "Ovo");
		dicionario.put(1, "Água");
		dicionario.put(2, "Escopeta");
		dicionario.put(3, "Cavalo");
		dicionario.put(4, "Dentista");
		dicionario.put(5, "Fogo");
		
		System.out.println("Lista de dicionério dos sonhos: " + dicionario);
		
		for (Integer chave : dicionario.keySet()) {
			System.out.println("O número " + chave + " esta associado a palavra " + dicionario.get(chave));
		}
	}
}
