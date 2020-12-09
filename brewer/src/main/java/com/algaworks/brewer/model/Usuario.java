package com.algaworks.brewer.model;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

public class Usuario {
	
	@NotBlank(message = "É obrigatório informar o nome.")
	private String nome;
	
	@NotBlank(message = "É obrigatório informar o e-mail.")
	private String email;
	
	@NotBlank(message = "'É obrigatório informar o logradouro.")
	private Date data;
	
	@NotBlank(message = "É obrigatório informar o número")
	private String senha;
		
	@NotBlank(message = "É obrigatório informar o CEP.")
	private String confirmacaoSenha;
	
	@NotBlank(message = "É obrigatório informar a cidade.")
	private String Status;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getConfirmacaoSenha() {
		return confirmacaoSenha;
	}

	public void setConfirmacaoSenha(String confirmacaoSenha) {
		this.confirmacaoSenha = confirmacaoSenha;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}	
		
}