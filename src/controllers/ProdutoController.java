package controllers;

import java.util.List;

import model.Produto;

public class ProdutoController {

	private ProdutoDAO produtoDAO;

	public ProdutoController(ProdutoDAO produtoDAO) {

		this.produtoDAO = produtoDAO;

	}

	public void adicionarProduto(Produto produto) {

		produtoDAO.adicionarProduto(produto);

	}

	public void atualizarProduto(Produto produto) {

		produtoDAO.atualizarProduto(produto);

	}

	public void deletarProduto(Produto produto) {

		produtoDAO.deletarProduto(produto);

	}

	public List<Produto> pegarTodosProdutos() {

		return produtoDAO.pegarTodosProdutos();

	}

	public Produto pegarProdutoPorId(int id) {

		return produtoDAO.pegarProdutoPorId(id);

	}

}
