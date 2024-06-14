package org.generation.italy.model;

public class DVD extends Disco {
	
	private String regista;
	private String categoria;
	
	
	public DVD(String nome, String anno, String regista, String categoria) {
		super(nome, anno);
		this.regista = regista;
		this.categoria = categoria;
	}


	public String getRegista() {
		return regista;
	}


	public void setRegista(String regista) {
		this.regista = regista;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	@Override
	public String toString() {
		return "DVD [nome="+nome+", anno="+anno+", regista=" + regista + ", categoria=" + categoria + "]";
	}
	
	

}
