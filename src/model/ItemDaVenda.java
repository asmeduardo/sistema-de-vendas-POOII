package model;

public class ItemDaVenda {

	private Integer idItemDaVenda;
	private Venda pedido;
	private Produto produto;
	private Integer quantidade;

	public ItemDaVenda() {
	}

	public ItemDaVenda(Integer idItemDaVenda, Venda pedido, Produto produto, Integer quantidade) {
		this.idItemDaVenda = idItemDaVenda;
		this.pedido = pedido;
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public Integer getIdItemDaVenda() {
		return idItemDaVenda;
	}

	public Venda getPedido() {
		return pedido;
	}

	public void setPedido(Venda pedido) {
		this.pedido = pedido;
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

}
