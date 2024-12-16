package com.naiaracosta.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.naiaracosta.farmacia.model.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Long>{
		 public List<Produtos> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
	}


