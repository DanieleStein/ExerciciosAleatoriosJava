package br.com.dicionariosListaConjuntos;

import java.util.HashMap;
import java.util.Map;

public class ApelidosNomeHashMap {
	
	public static void main(String[] args) {
		
	
	
	Map<String, String> nomes = new HashMap<>();
	
	nomes.put("João", "Juan, Fissura, Maromba");
	nomes.put("Miguel", "Night Watch, Bruce Wayne, Tampinha");
	nomes.put("Maria", "Wonder Woman, Mary, Marilene");
	nomes.put("Lucas", "Lukinha, Jorge, George");
	
	System.out.println(nomes);
	
	for (String nomeMesmo : nomes.keySet()) {
		System.out.println("O nome " + nomeMesmo + ", tem os seguintes apelidos: " + nomes.get(nomeMesmo));
	}
	}
}
