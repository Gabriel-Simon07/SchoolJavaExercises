package br.com.proway.senior.escola.model;

import br.com.proway.senior.escola.persistence.ArrayListPersistenceProva;

public class ProvaDao {

	ArrayListPersistenceProva db;
	
	public ProvaDao(ArrayListPersistenceProva db) {
		this.db=db;	
	}
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
		return db.get(Index);
	}
	

}
