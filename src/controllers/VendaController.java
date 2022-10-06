package controllers;

import java.util.List;

import model.Cliente;
import model.Compra;
import model.Produto;
import model.Venda;

public class VendaController {

	private VendaDAO vendaDAO;
	private ProdutoDAO produtoDAO;
	private ClienteDAO clienteDAO;

	public VendaController(){
        this.vendaDAO = new CompraDAO();
        this.produtoDAO = new ProdutoDAO();
        this.clienteDAO = new ClienteDAO();
    }

	public List<Venda> listarVendas() {
		return this.vendaDAO.listar();
	}

	public Compra buscarVendaPorId(int id) {
		return this.vendaDAO.buscarPorId(id);
	}

	public void excluirVenda(int id){
        this.vendaDAO.excluir(id);
    }

	public void realizarVenda(int idCliente, List<Integer> idProdutos, List<Integer> quantidades){
        Cliente cliente = this.clienteDAO.buscarPorId(idCliente);
        
        for(int i = 0; i < idProdutos.size(); i++){
            Produto produto = this.produtoDAO.buscarPorId(idProdutos.get(i));
        
            Venda venda = new Venda();
            venda.setCliente(cliente);
            venda.setProduto(produto);
            venda.setQuantidade(quantidades.get(i));
        
            this.compraDAO.salvar(compra);
        }
	}

}
