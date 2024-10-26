package com.lojavirtual.islucSistemas.model;


import jakarta.persistence.Entity;

import jakarta.persistence.Table;

@Entity
@Table(name = "pessoa_juridica")
//@PrimaryKeyJoinColumn(name = "id")
public class PessoaJuridica extends Pessoa {

	private static final long serialVersionUID = 1L;
	
	
	private String cnpj;
	private String escricaoEestadual;
	private String escricaoMunicipal;
	private String nomeFantasia;
	private String razaoSocial;
    private String categoria;
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEscricaoEestadual() {
		return escricaoEestadual;
	}
	public void setEscricaoEestadual(String escricaoEestadual) {
		this.escricaoEestadual = escricaoEestadual;
	}
	public String getEscricaoMunicipal() {
		return escricaoMunicipal;
	}
	public void setEscricaoMunicipal(String escricaoMunicipal) {
		this.escricaoMunicipal = escricaoMunicipal;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
    
    
	
	
	
			
			
	

}
