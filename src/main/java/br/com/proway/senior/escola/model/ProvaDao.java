package br.com.proway.senior.escola.model;

import java.util.ArrayList;

import br.com.proway.senior.escola.persistence.ArrayListPersistenceProva;

public class ProvaDao {

	Boletim boletim;

	ArrayListPersistenceProva db;
	


	public void removeAll(){
		db.removeAll();
	}
	
	public void remove(Integer index) {
		db.remove(index);
	}
	public Prova add(Prova prova) {
		return db.add(prova);
	}
	
	public Prova get(Integer Index) {
		return db.get(intex);
	}
	

}
