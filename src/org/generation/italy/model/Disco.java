package org.generation.italy.model;

public abstract class Disco {
	protected String nome;
	protected String anno;
	
	
	
	public Disco(String nome, String anno) {
		super();
		this.nome = nome;
		this.anno = anno;
	}



	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getAnno() {
		return anno;
	}



	public void setAnno(String anno) {
		this.anno = anno;
	}
	
	
}
