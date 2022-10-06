package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {

	private Integer idVenda;
	private Cliente cliente;
	private Date dataHoraPedido;
	private Double valorTotalVenda;

	private List<ItemDaVenda> itens;

	public Venda() {
	}

	public Venda(Integer idVenda, Cliente cliente) {
		this.idVenda = idVenda;
		this.cliente = cliente;
		this.dataHoraPedido = new Date();
		this.itens = new ArrayList<>();
	}

	public Integer getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(Integer idVenda) {
		this.idVenda = idVenda;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getDataHoraPedido() {
		return dataHoraPedido;
	}

	public List<ItemDaVenda> getItens() {
		return itens;
	}

	public Double getValorTotalVenda() {
		calcularValorTotalVenda();
		return valorTotalVenda;
	}
	
	public void calcularValorTotalVenda() {
		double valorTotalVenda = 0.0;
		for(ItemDaVenda idv : itens) {
			valorTotalVenda += idv.getQuantidade() * idv.getProduto().getPreco();
		}
		this.valorTotalVenda = valorTotalVenda;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Cupom Fiscal:\n");
		sb.append("Valor total da compra: ");
		sb.append(String.format("%.2f", getValorTotalVenda()));
		sb.append("\nItens da compra:\n");
		
		for(ItemDaVenda idv : itens) {
			sb.append("Produto: ");
			sb.append(idv.getProduto().getNome());
			sb.append(", Preço: ");
			sb.append(String.format("%.2f", idv.getProduto().getPreco()));
			sb.append(", Quantidade: ");
			sb.append(idv.getQuantidade());
			sb.append("\n");
		}
		
		return sb.toString();
	}

}
