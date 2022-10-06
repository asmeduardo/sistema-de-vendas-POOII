package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Compra {
	
	private Integer idCompra;
	private Fornecedor fornecedor;
	private Date dataCompra;
	private Double valorTotalCompra;
	
	private List<ItemDaCompra> itens;
	
	public Compra() {
	}

	public Compra(Integer idCompra, Fornecedor fornecedor) {
		this.idCompra = idCompra;
		this.fornecedor = fornecedor;
		this.dataCompra = new Date();
		this.itens = new ArrayList<>();
	}

	public Integer getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(Integer idCompra) {
		this.idCompra = idCompra;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public Double getValorTotalCompra() {
		calcularValorTotalCompra();
		return valorTotalCompra;
	}

	public List<ItemDaCompra> getItens() {
		return itens;
	}
	
	public void calcularValorTotalCompra() {
		double valorTotalCompra = 0.0;
		for(ItemDaCompra idv : itens) {
			valorTotalCompra += idv.getQuantidade() * idv.getProduto().getPreco();
		}
		this.valorTotalCompra = valorTotalCompra;
	}

}
