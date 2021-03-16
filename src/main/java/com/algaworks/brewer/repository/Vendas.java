package com.algaworks.brewer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.brewer.model.Venda;

@Repository
public interface Vendas extends JpaRepository<Venda, Long> {

	
}
