package com.algaworks.brewer.session;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.algaworks.brewer.model.Cerveja;

public class TabelaItensVendaTest {

	private TabelaItensVenda tabelaItensVenda;
	
	@Before
	public void setUp() {
		this.tabelaItensVenda = new TabelaItensVenda("1");
	}
	
	@Test
	public void deveCalcularValorTotalSemItens() throws Exception {
		assertEquals(BigDecimal.ZERO, tabelaItensVenda.getValorTotal());
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
	
	@Test
	public void deveAlterarAQuantidadeDeCerveja() throws Exception {
		Cerveja c1 = new Cerveja();
		c1.setCodigo(1L);
		c1.setValor(new BigDecimal(9.00));
		
		tabelaItensVenda.adicionarItem(c1, 1);		
		tabelaItensVenda.alterarQuantidadeItens(c1, 10);	
		
		assertEquals(new BigDecimal(90.00), tabelaItensVenda.getValorTotal());
		assertEquals(1, tabelaItensVenda.total());

	}
	
	@Test
	public void deveExcluirItem() throws Exception {
		Cerveja c1 = new Cerveja();
		c1.setCodigo(1L);
		c1.setValor(new BigDecimal(9.00));		
		tabelaItensVenda.adicionarItem(c1, 1);
		
		Cerveja c2 = new Cerveja();
		c2.setCodigo(2L);
		c2.setValor(new BigDecimal(9.00));		
		tabelaItensVenda.adicionarItem(c2, 2);
		
		Cerveja c3 = new Cerveja();
		c3.setCodigo(3L);
		c3.setValor(new BigDecimal(9.00));		
		tabelaItensVenda.adicionarItem(c3, 1);
		
		tabelaItensVenda.excluirItem(c2);
		
		assertEquals(2, tabelaItensVenda.total());
		assertEquals(new BigDecimal(18.00), tabelaItensVenda.getValorTotal());		
	}
	
	@Test
	public void myTest() {
		
		
	      float[] v = {(float) 2.0, (float)3.0, (float)4.0, (float)5.0, (float)6.0};
	      
	      float[] u = new float[5] ;
	      
			for (int i = 1; i < 5; i++) {
				
				u[i] = v[i] * i;
				
			}
			System.out.println(u[2]);		
			System.out.println(u[4]);		
		
		
		
		
		//System.out.println(155 -5 + 200  -1 + 170 + 300 + 0 -30 + 600 + 125 + 370 + 25);	
		
		
        //int[] array = {155, -5, 200, -1, 170, 300, 0, -30, 600, 125, 370, 25};
		//int x = 0;
		//for (int i = 0; i < array.length; i++) {
			
		//	if((array[i] <= 0) || (array[i] > 125)) {
		//	   x = x + 1;
		//	}
			
		//}
		//System.out.println(x);
		

		/*
		 * float n1 = 10; float n2 = 8; float res;
		 * 
		 * 
		 * if (n1 > n2) { res = (n1-n2)/n1; } else { res = (n2-n1)/n2; }
		 * 
		 * System.out.println(res);
		 * 
		 * 
		 * n1 = 3; n2 = 12;
		 * 
		 * if (n1 > n2) { res = (n1-n2)/n1; } else { res = (n2-n1)/n2; }
		 * 
		 * System.out.println(res);
		 * 
		 * 
		 * n1 = 5; n2 = 5;
		 * 
		 * if (n1 > n2) { res = (n1-n2)/n1; } else { res = (n2-n1)/n2; }
		 * 
		 * System.out.println(res);
		 */
		
		
		
	}
	
}

