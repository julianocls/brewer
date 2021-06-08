package com.algaworks.brewer.dto;

import java.math.BigDecimal;

public class DadosEstoqueDTO {

	private BigDecimal valor;
	private Long quantidadeEstoque;

	public DadosEstoqueDTO() {

	}

	public DadosEstoqueDTO(BigDecimal valor, Long quantidadeEstoque) {
		this.valor = valor;
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public BigDecimal getValor() {
		return valor != null ? valor : BigDecimal.ZERO;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Long getQuantidadeEstoque() {
		return quantidadeEstoque != null ? quantidadeEstoque : 0L;
	}

	public void setQuantidadeEstoque(Long quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

}
