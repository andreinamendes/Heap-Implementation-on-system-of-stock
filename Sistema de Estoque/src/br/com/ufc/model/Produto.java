package br.com.ufc.model;

public class Produto {
	private int codigo;
	private String nome;
	private String data_fab;
	private String data_val;
	private int quantidade;
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getData_fab() {
		return data_fab;
	}

	public void setData_fab(String data_fab) {
		this.data_fab = data_fab;
	}

	public String getData_val() {
		return data_val;
	}

	public void setData_val(String data_val) {
		this.data_fab = data_val;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}