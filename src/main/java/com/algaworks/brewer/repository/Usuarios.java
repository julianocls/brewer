package com.algaworks.brewer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.brewer.model.Usuario;

@Repository
public interface Usuarios extends JpaRepository<Usuario, Long> {

	public Optional<Usuario> findByNomeIgnoreCase(String nome);

	public Optional<Usuario> findByEmailIgnoreCase(String email);
	
}
