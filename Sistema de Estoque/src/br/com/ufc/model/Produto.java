package br.com.ufc.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Produto {
	private int codigo;
	private String nome;
	private Date data_fab;
	private Date data_val;
	private int quantidade;
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public Date getData_fab() {
		return data_fab;
	}

	public void setData_fab(String data_fab) {
		try {
			this.data_fab = new SimpleDateFormat("dd/MM/yyyy").parse(data_fab);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public Date getData_val() {
		return data_val;
	}

	public void setData_val(String data_val) {
		try {
			this.data_fab = new SimpleDateFormat("dd/MM/yyyy").parse(data_val);
		} catch (ParseException e) {
			e.printStackTrace();
		}
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