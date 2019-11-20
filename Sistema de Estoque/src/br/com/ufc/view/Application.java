package br.com.ufc.view;

import br.com.ufc.model.*;

public class Application {
	public static void main(String[] args) {
		Produto produto1 = new Produto();
		produto1.setQuantidade(2);
		produto1.setNome("Arroz");
		
		Estoque estoque1 = new Estoque();
		estoque1.setCategoria("Industrializados");
		estoque1.setProdutos(produto1);
		
		System.out.println(estoque1.getProdutos());
	}
}