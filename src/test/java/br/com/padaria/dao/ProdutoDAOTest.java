package br.com.padaria.dao;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.padaria.domain.Fabricante;
import br.com.padaria.domain.Produto;

public class ProdutoDAOTest {
	@Test
	public void salvar(){
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(new Long("1"));
		
		Produto produto = new Produto();
		produto.setDescricao("Cataflan 50mg com 20 Comprimidos");
		produto.setFabricante(fabricante);
		produto.setPreco(new BigDecimal("13.70"));
		produto.setQuantidade(new Short("7"));
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		produtoDAO.salvar(produto);
		
		System.out.println("Produto salvo com sucesso");
	}
}
