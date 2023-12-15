package com.generation.loja_de_jogos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.loja_de_jogos.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByNomeContainingIgnoreCase(@Param("nome")String nome);
    
public List<Produto>findAllByDescricaoContainingIgnoreCase(@Param("descricao" )String descricao);

}