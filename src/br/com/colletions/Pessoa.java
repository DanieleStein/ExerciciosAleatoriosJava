package br.com.colletions;

public class Pessoa {
	
	private String nome;
	private String nomeMaior;
	private int idade;
	private int idadeMaior;
	
	public Pessoa(String nome, String nomeMaior, int idade, int idadeMaior) {
		super();
		this.nome = nome;
		this.nomeMaior = nomeMaior;
		this.idade = idade;
		this.idadeMaior = idadeMaior;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeMaior() {
		return nomeMaior;
	}

	public void setNomeMaior(String nomeMaior) {
		this.nomeMaior = nomeMaior;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdadeMaior() {
		return idadeMaior;
	}

	public void setIdadeMaior(int idadeMaior) {
		this.idadeMaior = idadeMaior;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", nomeMaior=" + nomeMaior + ", idade=" + idade + ", idadeMaior=" + idadeMaior
				+ "]";
	}
	
	
	
	
	
	
	

}
