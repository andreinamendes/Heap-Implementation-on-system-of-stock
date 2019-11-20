package br.com.ufc.model;

import java.util.LinkedList;
import java.util.List;

public class Estoque {
	private String categoria;
	private LinkedList<Produto> produtos;
	
	public Estoque() {
		this.produtos = new LinkedList<>();
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public List<Produto> getProdutos(){
		return produtos;
	}
	
	public void setProdutos(Produto produto) {
		
	}
}
