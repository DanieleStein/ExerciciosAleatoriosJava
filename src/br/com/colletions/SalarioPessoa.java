package br.com.colletions;

public class SalarioPessoa {
	
	private String nome;
	private int idade;
	private double salario;
	
	
	public SalarioPessoa(String nome, int idade, double salario) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	@Override
	public String toString() {
		return "ArrayListaScanner [nome=" + nome + ", idade=" + idade + ", salario=" + salario + "]";
	}


	


	
	
	
	
	

}
