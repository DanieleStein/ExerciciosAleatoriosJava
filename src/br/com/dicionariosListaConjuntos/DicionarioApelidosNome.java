package br.com.dicionariosListaConjuntos;

//Criar um dicionário que represente os apelidos que uso para chamar os meus amigos. Para isso, 
//o dicionário deverá ter como chave String e como valor uma lista de Strings.
//João → Juan, Fissura, Maromba
//Miguel → Night Watch, Bruce Wayne, Tampinha 
//Maria → Wonder Woman, Mary, Marilene
//Lucas → Lukinha, Jorge, George
//Em seguida crie uma classe Exercício 1 com seu método main, imprimir no Main todas as chaves junto com seus valores associados.
//Para isso, utilizar o foreach com as chaves.

import java.util.HashMap;
import java.util.Map;

public class DicionarioApelidosNome {
	
	public static void main(String[] args) {
		
	//Dicionario é uma colecao de dados que existe uma chave e um valor, através das chaves, é possível pegar o valor.
	Map<String, String> dicionario = new HashMap<>();
	
	dicionario.put("João", "Juan, Fissura, Maromba");
	dicionario.put("Miguel", "Night Watch, Bruce Wayne, Tampinha");
	dicionario.put("Maria", "Wonder Woman, Mary, Marilene");
	dicionario.put("Lucas", "Lukinha, Jorge, George");
	
	System.out.println(dicionario);
	
	for (String nomeMesmo : dicionario.keySet()) {
		System.out.println("O nome " + nomeMesmo + ", tem os seguintes apelidos: " + dicionario.get(nomeMesmo));
	}
	}
}
