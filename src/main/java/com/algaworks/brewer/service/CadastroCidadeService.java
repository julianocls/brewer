package com.algaworks.brewer.service;

import java.util.Optional;

import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.algaworks.brewer.model.Cidade;
import com.algaworks.brewer.repository.Cidades;
import com.algaworks.brewer.service.exception.ImpossivelExcluirEntidadeException;
import com.algaworks.brewer.service.exception.NomeCidadeJaCadastradaException;

@Service
public class CadastroCidadeService {

	@Autowired
	private Cidades cidades;

	@Transactional
	public void salvar(Cidade cidade) {

		Optional<Cidade> cidadeExistente = cidades.findByNomeAndEstado(cidade.getNome(), cidade.getEstado());
		if (cidadeExistente.isPresent()) {
			if (cidade.isNova() || !cidadeExistente.get().getCodigo().equals(cidade.getCodigo())) {
				throw new NomeCidadeJaCadastradaException("Cidade já cadastrada para o estado selecionado");
			}
		}

		cidades.save(cidade);
	}

	@Transactional
	public void excluir(Cidade cidade) {
		try {
			cidades.delete(cidade);
			cidades.flush();
		} catch (PersistenceException e) {
			throw new ImpossivelExcluirEntidadeException("Exclusão não permitida. Esta cidade está sendo utilizada em outro cadastro.");
		}
	}

}
