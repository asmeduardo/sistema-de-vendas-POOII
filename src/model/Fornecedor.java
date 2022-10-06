package model;

public class Fornecedor {

	private Integer idFornecedor;
	private String cnpj;
	private String razaoSocial;
	private Endereco endereco;

	public Fornecedor() {
	}

	public Fornecedor(Integer idFornecedor, String cnpj, String razaoSocial, Endereco endereco) {
		this.idFornecedor = idFornecedor;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.endereco = endereco;
	}

	public Integer getIdFornecedor() {
		return idFornecedor;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
