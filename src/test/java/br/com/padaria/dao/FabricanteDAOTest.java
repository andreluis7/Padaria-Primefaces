package br.com.padaria.dao;

import java.util.List;

import org.junit.Test;

import br.com.padaria.domain.Fabricante;

public class FabricanteDAOTest {
	@Test
	public void salvar() {
		Fabricante fabricante = new Fabricante();
		fabricante.setDescricao("Aché");

		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		fabricanteDAO.salvar(fabricante);
	}

	@Test
	public void listar() {
		FabricanteDAO FabricanteDAO = new FabricanteDAO();
		List<Fabricante> resultado = FabricanteDAO.listar();

		System.out.println("Total de Registros Encontrados: " + resultado.size());

		for (Fabricante fabricante : resultado) {
			System.out.println(fabricante.getCodigo() + " - " + fabricante.getDescricao());
		}
	}
	
	@Test
	public void buscar(){
		Long codigo = 1L;
		
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(codigo);
		
		if(fabricante == null){
			System.out.println("Nenhum registro encontrado");
		}else{
			System.out.println("Registro encontrado:");
			System.out.println(fabricante.getCodigo() + " - " + fabricante.getDescricao());
		}
	}
	
	@Test
	public void merge() {
		//Fabricante fabricante = new Fabricante();
		//fabricante.setDescricao("Fabricante A");
		//FabricanteDAO fabricanteDAO = new FabricanteDAO();
		//fabricanteDAO.merge(fabricante);
		
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(1L);
		fabricante.setDescricao("Fabricante B");
		fabricanteDAO.merge(fabricante);
	}
}
