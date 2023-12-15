package com.generation.loja_de_jogos.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
	@Column(length= 1000)
	@NotBlank(message = "O nome do produto é Obrigatório!")
	@Size(min = 10, max = 1000, message = "O nome do produto deve conter no mínimo 10 e no máximo 1000 caracteres")
	private String nome;
	
	@NotNull(message = "Insira o valor do Produto!!")
	private float preco;
	
	@NotBlank(message = "O tipo de plataforma é Obrigatório!") 
	@Size(min = 5, max = 100, message = "O tipo de plataforma deve conter no mínimo 05 e no máximo 100 caracteres")
	@Column(length= 100) 
	private String plataforma;
	
	@NotBlank(message = "O campo descrição é Obrigatório!") 
	@Size(min = 5, max = 100, message = "O campo descrição deve conter no mínimo 05 e no máximo 100 caracteres")
	@Column(length= 100) 
	private String descricao;
    
	@ManyToOne
	@JsonIgnoreProperties("produto") 
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
      
}