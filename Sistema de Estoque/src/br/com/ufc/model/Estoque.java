package br.com.ufc.model;

import java.util.HashMap;

public class Estoque {
	String categoria;
	HashMap<Integer, Produto> produtos;

	public Estoque() {
		this.produtos = new HashMap<Integer, Produto>(); 
	}
	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public HashMap<Integer, Produto> getProdutos() {
		return produtos;
	}

	public Produto getProdutos(String nome){
		for(int a = 0; a < this.produtos.size(); a++) {
			if(this.produtos.get(a).getNome() == nome) {
				return produtos.get(a);
			}
		}
		return null;
	}
	
	public boolean setProduto(Produto produto, Funcionario funcionario) {
		if(funcionario.getCargo().equals("Gerente")) {
			produtos.put(produto.getCodigo(), produto);
			return true;
		}
		return false;
	}
	
	public void updateProduto(Produto produto) {
		produtos.replace(produto.getCodigo(), produto);
	}
	
	public void removeProduto(int codigo, Funcionario funcionario) {
		if(funcionario.getCargo().equals("Gerente"))
			produtos.remove(codigo);
	}
}