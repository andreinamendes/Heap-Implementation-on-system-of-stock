package br.com.ufc.controller;

import java.util.HashMap;
import br.com.ufc.model.Estoque;
import br.com.ufc.model.Funcionario;
import br.com.ufc.model.Produto;

public class DistribuidoraController {
	private HashMap<String, Funcionario> funcionarios;
	private HashMap<String, Estoque> estoques;
	
	public DistribuidoraController() {
		Funcionario funcionario = new Funcionario();
		funcionario.setCargo("Gerente");
		funcionario.setSenha("1234");
		funcionario.setNome("Andreina");
		funcionario.setSalario(3500);
		funcionario.setCpf("123456789");
		this.funcionarios = new HashMap<String, Funcionario>();
		this.funcionarios.put(funcionario.getCpf(), funcionario);
		this.estoques = new HashMap<String, Estoque>();
	}
	
	public Funcionario loginFuncionario(String cpf, String senha) {
		if(funcionarios.get(cpf) != null)
			if(funcionarios.get(cpf).getSenha().equals(senha))
				return funcionarios.get(cpf);
		return null;
	}
	
	public Funcionario getFuncionarios(String nome, Funcionario funcionario) {
		if(funcionario.getCargo().equals("Gerente"))
			return funcionarios.get(nome);
		return null;
	}
	
	public HashMap<String, Funcionario> getAllFuncionarios(Funcionario funcionario){
		if(funcionario.getCargo().equals("Gerente"))
			return funcionarios;
		return null;
	}
	
	public boolean setFuncionarios(Funcionario newFuncionario, Funcionario funcionario) {
		if(funcionario.getCargo().equals("Gerente")) {
			this.funcionarios.put(funcionario.getCpf(), funcionario);
			return true;
		}
		return false;
	}

	public Estoque getEstoque(String categoria) {
		return estoques.get(categoria);
	}

	public  HashMap<String, Estoque> getAllEstoque(Funcionario funcionario){
		if(funcionario.getCargo().equals("Gerente"))
			return estoques;
		return null;
	}
	
	public boolean setEstoque(Estoque estoque, Funcionario funcionario) {
		if(funcionario.getCargo().equals("Gerente")) {
			this.estoques.put(estoque.getCategoria(), estoque);
			return true;
		}
		return false;
	}
	
	public boolean setProdutos(Estoque estoque, Produto produto, Funcionario funcionario) {
			if(estoques.get(estoque.getCategoria()).setProduto(produto, funcionario))
				return true;
			return false;
	}
	
	public Estoque buscarProduto(String nome) {
		for(String key: estoques.keySet()) {
			if(estoques.get(key).getProdutos(nome) != null)
				return estoques.get(key);
		}
		return null;
	}
}
