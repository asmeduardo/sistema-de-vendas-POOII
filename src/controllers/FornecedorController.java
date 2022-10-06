package controllers;

import java.util.List;

import model.Fornecedor;

public class FornecedorController {

	private FornecedorDAO fornecedorDAO;

	public FornecedorController(FornecedorDAO fornecedorDAO) {
		this.fornecedorDAO = fornecedorDAO;
	}

	public List<Fornecedor> listarTodosFornecedores() {
		return fornecedorDAO.listarTodosFornecedores();
	}

	public Fornecedor buscarFornecedorPeloId(int idFornecedor) {
		return fornecedorDAO.buscarFornecedorPeloId(idFornecedor);
	}

	public void adicionarFornecedor(Fornecedor fornecedor) {
		fornecedorDAO.addSupplier(fornecedor);
	}

	public void atualizarFornecedor(Fornecedor fornecedor) {
		fornecedorDAO.atualizarFornecedor(fornecedor);
	}

	public void deletarFornecedor(int idFornecedor) {
		fornecedorDAO.deletarFornecedor(idFornecedor);
	}

}
