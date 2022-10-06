package controllers;

import java.util.List;

import model.Cliente;
import model.Compra;
import model.Produto;

public class CompraController {
	  
    private CompraDAO compraDAO;
    private ProdutoDAO produtoDAO;
    private ClienteDAO clienteDAO;
    
    public CompraController(){
        this.compraDAO = new CompraDAO();
        this.produtoDAO = new ProdutoDAO();
        this.clienteDAO = new ClienteDAO();
    }
    
    public void realizarCompra(int idCliente, int idProduto, int quantidade){
        Cliente cliente = this.clienteDAO.buscarPorId(idCliente);
        Produto produto = this.produtoDAO.buscarPorId(idProduto);
        
        Compra compra = new Compra();
        compra.setCliente(cliente);
        compra.setProduto(produto);
        compra.setQuantidade(quantidade);
        
        this.compraDAO.salvar(compra);
    }
    
    public List<Compra> listarCompras(){
        return this.compraDAO.listar();
    }
    
    public Compra buscarCompraPorId(int id){
        return this.compraDAO.buscarPorId(id);
    }
    
    public void excluirCompra(int idCompra){
        this.compraDAO.excluir(idCompra);
    }
    
}
