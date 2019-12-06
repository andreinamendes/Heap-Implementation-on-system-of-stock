package br.com.ufc.model;

public class Funcionario {
	private String nome;
	private String cpf;
	private String cargo;
	private int salario;
	private String senha;
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public int getSalario() {
		return salario;
	}
	
	public void setSalario(int salário) {
		this.salario = salário;
	}
}