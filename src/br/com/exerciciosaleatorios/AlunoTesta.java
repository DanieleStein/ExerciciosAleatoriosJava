package br.com.exerciciosaleatorios;

//Aluno
//Escreva uma classe para representar um Aluno. Adicione atributos relacionados às características
//de um Aluno, como nome, matrícula, curso que está matriculado, nome de 3 disciplinas que está cursando
//e as notas dessas 3 disciplinas. Desenvolva um método para verificar se o aluno está aprovado
//(nota maior ou igual a 7) em uma determinada disciplina. Escreva um programa para testar essa classe,
//que pede as informações do aluno ao usuário e ao final informa o nome das disciplinas, mostra as notas
//e mostra se o aluno for aprovado ou não.

import java.util.Scanner;

public class AlunoTesta {
	
	public static void verificarAprovacao(Aluno aluno) {
		for (int i = 0; i < aluno.disciplina.length; i++) {
			if (aluno.notas[i] >= 7) {
				System.out.println(aluno.disciplina[i] + " Aprovado, com nota " + aluno.notas[i]);
			} else {
				System.out.println(aluno.disciplina[i] + " Reprovado, com nota " + aluno.notas[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Aluno al1 = new Aluno();
		
		System.out.println("Qual nome do aluno? ");
		al1.nome = entrada.nextLine();
		
		System.out.println("Qual é o seu curso? ");
		al1.curso = entrada.nextLine();
		
		for (int i = 0; i < al1.disciplina.length; i++) {
		System.out.println("Quais são as disciplinas? ");
		al1.disciplina[i] = entrada.nextLine();
		
		System.out.println("Quais são as notas? ");
		al1.notas[i] = Double.parseDouble(entrada.nextLine());
		//Integer.parseInteger(entrada.nextLine());
		//Boolean.parseBoolean(entrada.nextLine());
		//entrada.nextLine(); // para caractere
		
		}
		verificarAprovacao(al1);
		
	}

}
