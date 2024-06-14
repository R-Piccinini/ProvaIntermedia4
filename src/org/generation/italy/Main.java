package org.generation.italy;

import java.util.ArrayList;

import org.generation.italy.model.CdMusicale;
import org.generation.italy.model.DVD;
import org.generation.italy.model.Disco;

public class Main {

	public static void main(String[] args) {
		
		
		DVD dvd=new DVD("The Bourne Identity","2002","Doug Liman","Thriller");
		
		CdMusicale cd=new CdMusicale("Cracker Island","2023","Alternative","Gorillaz");
		
		ArrayList<Disco> elencoDischi=new ArrayList<Disco>();
		
		elencoDischi.add(dvd);
		
		elencoDischi.add(cd);
		
		for(Disco d:elencoDischi) {
			System.out.println(d.toString()); //polimorfismo di to string
		}
	}

}
