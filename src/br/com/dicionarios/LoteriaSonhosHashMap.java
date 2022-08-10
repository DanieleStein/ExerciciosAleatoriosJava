package br.com.dicionarios;

//Criar um dicionário que represente os primeiros 5 números da “Loteria dos Sonhos”, junto com seu significado. Para isso, o dicionário deverá ter como chave Integer e como valor uma String.
//Números da Loteria dos Sonhos:
//0→Ovo /1→Água /2 → Escopeta /3 → Cavalo /4 → Dentista /5→Fogo

import java.util.HashMap;
import java.util.Map;

public class LoteriaSonhosHashMap {
	
	public static void main(String[] args) {
		
		Map<Integer, String> sonhos = new HashMap<>();
		
		sonhos.put(0, "Ovo");
		sonhos.put(1, "Água");
		sonhos.put(2, "Escopeta");
		sonhos.put(3, "Cavalo");
		sonhos.put(4, "Dentista");
		sonhos.put(5, "Fogo");
		
		System.out.println("Lista de dicionério dos sonhos: " + sonhos);
		
		for (Integer chave : sonhos.keySet()) {
			System.out.println("O número " + chave + " esta associado a palavra " + sonhos.get(chave));
		}
	}
}
