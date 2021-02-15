package com.algaworks.brewer.venda;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import com.algaworks.brewer.model.Cerveja;
import com.algaworks.brewer.session.TabelaItensVenda;

public class TabelaItensVendaTest {

	private TabelaItensVenda tabelaItensVenda;

	@Before
	public void setUp() {
		this.tabelaItensVenda = new TabelaItensVenda();
	}

	@Test
	public void deveCalcularValorTotalSemItem() throws Exception {
		assertEquals(BigDecimal.ZERO, tabelaItensVenda.getValorTotal());
	}

	@Test
	public void deveCalcularValorTotalComUmItem() throws Exception {
		Cerveja cerveja = new Cerveja();

		BigDecimal valor = new BigDecimal(6.90);
		cerveja.setValor(valor);

		tabelaItensVenda.adicionarItem(cerveja, 1);
		
		assertEquals(valor, tabelaItensVenda.getValorTotal());
	}

	@Test
	public void deveCalcularValorTotalComVariosItens() throws Exception {
		Cerveja c1 = new Cerveja();
		c1.setCodigo(1L);
		BigDecimal v1 = new BigDecimal(6.00);
		c1.setValor(v1);
		
		Cerveja c2 = new Cerveja();
		c1.setCodigo(2L);
		BigDecimal v2 = new BigDecimal(5.00);
		c2.setValor(v2);		
		
		tabelaItensVenda.adicionarItem(c1, 1);
		tabelaItensVenda.adicionarItem(c2, 2);
		
		assertEquals(new BigDecimal(16.00), tabelaItensVenda.getValorTotal());
	}
	
	
	@Test
	public void deveManterTamanhoDaListaParaMesmaCerveja() throws Exception {
		Cerveja c1 = new Cerveja();
		c1.setCodigo(1L);
		c1.setValor(new BigDecimal(9.00));
		
		tabelaItensVenda.adicionarItem(c1, 1);
		tabelaItensVenda.adicionarItem(c1, 1);
		
		assertEquals(1, tabelaItensVenda.total());
		assertEquals(new BigDecimal(18.00), tabelaItensVenda.getValorTotal());
	}
	
}

