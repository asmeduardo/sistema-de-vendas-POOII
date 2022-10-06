package model;

import model.enums.Genero;

public class Cliente {

	private Integer idCliente;
	private String nome;
	private String cpf;
	private String telefone;
	private Endereco endereco;
	private Genero sexo;

	public Cliente() {
	}

	public Cliente(Integer idCliente, String nome, String cpf, String telefone, Endereco endereco, Genero sexo) {
		this.idCliente = idCliente;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		this.sexo = sexo;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Genero getSexo() {
		return sexo;
	}

	public void setSexo(Genero sexo) {
		this.sexo = sexo;
	}

}
