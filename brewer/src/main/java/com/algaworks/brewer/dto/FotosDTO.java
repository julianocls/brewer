package com.algaworks.brewer.dto;

public class FotosDTO {

	private String nome;
	private String contentType;
		
	public FotosDTO(String nome, String contentType) {
		this.nome = nome;
		this.contentType = contentType;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	
}
