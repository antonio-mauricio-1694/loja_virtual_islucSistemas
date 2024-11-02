package com.lojavirtual.islucSistemas.enums;

public enum TipoEndereco {
	

	
	COBRANCA ("cobrança"),
	EENDERECO ("endereço");
	
	private String descricao;
	
	private TipoEndereco(String descricao) {
		
		this.descricao = descricao;
		
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		
		return this.descricao;
	}
}
