package model;

public class Produto {

	private Integer idProduto;
	private Integer idFornecedor;
	private String nome;
	private Double preco;
	private Integer quantidade;

	public Produto() {
	}

	public Produto(Integer idProduto, Integer idFornecedor, String nome, Double preco, Integer quantidade) {
		this.idProduto = idProduto;
		this.idFornecedor = idFornecedor;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public Integer getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(Integer idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

}
