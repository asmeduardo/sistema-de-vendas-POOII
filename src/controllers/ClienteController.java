package controllers;

import java.util.List;

import model.Cliente;

public class ClienteController {

	private ClienteDAO clienteDAO;

	// Ainda precisa criar as classes 'DAO' para acesso ao banco de dados

	public ClienteController(ClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}

	public void criarCliente(Cliente cliente) {
		clienteDAO.criarCliente(cliente);
	}

	public Cliente buscarCliente(int idCliente) {
		return clienteDAO.buscarCliente(idCliente);
	}

	public void atualizarCliente(Cliente cliente) {
		clienteDAO.atualizarCliente(cliente);
	}

	public void deletarCliente(int idCliente) {
		clienteDAO.deletarCliente(idCliente);
	}

	public List<Cliente> listarClientes() {
		return clienteDAO.listarTodosClientes();
	}
	
	public void efetuarCompra() {
		/* ... */
	}

}
