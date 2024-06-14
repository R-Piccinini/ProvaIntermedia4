package org.generation.italy.model;

public class CdMusicale extends Disco{
	
	private String genere;
	private String autore;
	
	
	
	public CdMusicale(String nome, String anno, String genere, String autore) {
		super(nome, anno);
		this.genere = genere;
		this.autore = autore;
	}



	public String getGenere() {
		return genere;
	}



	public void setGenere(String genere) {
		this.genere = genere;
	}



	public String getAutore() {
		return autore;
	}



	public void setAutore(String autore) {
		this.autore = autore;
	}



	@Override
	public String toString() {
		return "CdMusicale [nome="+nome+", anno="+anno+", genere=" + genere + ", autore=" + autore + "]";
	}
	
	


}
