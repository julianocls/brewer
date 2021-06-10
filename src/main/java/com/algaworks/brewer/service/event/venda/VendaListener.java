package com.algaworks.brewer.service.event.venda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.algaworks.brewer.model.Cerveja;
import com.algaworks.brewer.model.ItemVenda;
import com.algaworks.brewer.model.StatusVenda;
import com.algaworks.brewer.model.Venda;
import com.algaworks.brewer.repository.Cervejas;
import com.algaworks.brewer.repository.Vendas;

@Component
public class VendaListener {

	@Autowired
	Cervejas cervejas;

	@Autowired
	Vendas vendas;

	@EventListener
	public void vendaEmitida(VendaEvent vendaEvent) {

		Venda venda = vendas.buscarComItens(vendaEvent.getVenda().getCodigo());

		for (ItemVenda item : venda.getItens()) {
			Cerveja cerveja = cervejas.findOne(item.getCerveja().getCodigo());

			if (vendaEvent.getVenda().getStatus().equals(StatusVenda.EMITIDA)) {
				cerveja.setQuantidadeEstoque(cerveja.getQuantidadeEstoque() - item.getQuantidade());
			} else if (vendaEvent.getVenda().getStatus().equals(StatusVenda.CANCELADA)) {
				cerveja.setQuantidadeEstoque(cerveja.getQuantidadeEstoque() + item.getQuantidade());
			}

			cervejas.save(cerveja);
		}
	}

}
