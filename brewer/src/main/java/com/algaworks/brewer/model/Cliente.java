package com.algaworks.brewer.model;

import org.hibernate.validator.constraints.NotBlank;

public class Cliente {
	
	@NotBlank(message = "É obrigatório informar o nome.")
	private String nome;
	
	@NotBlank(message = "É obrigatório informar o tipo.")
	private String tipo;
	
	@NotBlank(message = "É obrigatório informar o CPF/CNPJ.")
	private Integer cpfCnpj;
	
	@NotBlank(message = "É obrigatório informar o telefone.")
	private String telefone;
	
	@NotBlank(message = "É obrigatório informar o e-mail.")
	private String email;
	
	@NotBlank(message = "'É obrigatório informar o logradouro.")
	private String logradouro;
	
	@NotBlank(message = "É obrigatório informar o número")
	private String numero;
	
	private String complemento;
	
	@NotBlank(message = "É obrigatório informar o CEP.")
	private String cep;
	
	@NotBlank(message = "É obrigatório informar a cidade.")
	private String cidade;
	
	@NotBlank(message = "É obrigatório informar o estado.")
	private String estado;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(Integer cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
		
}