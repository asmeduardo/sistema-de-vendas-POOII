package model;

public class ItemDaCompra {

	private Integer idItemDaCompra;
	private Compra compra;
	private Produto produto;
	private Integer quantidade;
	private Double valorUnitario;
	
	public ItemDaCompra() {
	}

	public ItemDaCompra(Integer idItemDaCompra, Compra compra, Produto produto, Integer quantidade,
			Double valorUnitario) {
		this.idItemDaCompra = idItemDaCompra;
		this.compra = compra;
		this.produto = produto;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
	}

	public Integer getIdItemDaCompra() {
		return idItemDaCompra;
	}

	public void setIdItemDaCompra(Integer idItemDaCompra) {
		this.idItemDaCompra = idItemDaCompra;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
}
