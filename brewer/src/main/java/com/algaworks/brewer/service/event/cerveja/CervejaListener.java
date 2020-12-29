package com.algaworks.brewer.service.event.cerveja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.algaworks.brewer.service.CervejaSalvaEvent;
import com.algaworks.brewer.storage.FotoStorage;

@Component
public class CervejaListener {
	
	@Autowired
	FotoStorage fotoStorage;

	@EventListener(condition = "#evento.temFoto()")
	public void cervejaSalva(CervejaSalvaEvent evento) {
		fotoStorage.salvar(evento.getCerveja().getFoto());
	}

}
