package model;

public class Endereco {

	private String logradouro;
	private String numero;
	private String cep;
	private String referencia;

	public Endereco() {
	}

	public Endereco(String logradouro, String numero, String cep, String referencia) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
		this.referencia = referencia;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

}
