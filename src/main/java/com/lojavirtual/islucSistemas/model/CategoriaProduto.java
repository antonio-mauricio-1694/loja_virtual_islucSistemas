package com.lojavirtual.islucSistemas.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table(name= "Categoria_produto")
@SequenceGenerator(name= "seq_Categoria_produto", sequenceName = "seq_Categoria_produto" , allocationSize = 1,initialValue = 1)
public class CategoriaProduto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_Categoria_produto" )
	private long id;
	
	@Column(name= "nome_desc" , nullable = false)
	private String  nomeDesc;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomeDescricao() {
		return nomeDesc;
	}
	public void setNomeDescricao(String nomeDescricao) {
		this.nomeDesc = nomeDescricao;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CategoriaProduto other = (CategoriaProduto) obj;
		return id == other.id;
	}
	
	
	
	
	
	
	
	


}
