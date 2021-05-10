package br.com.proway.senior.escola.model;

import br.com.proway.senior.escola.persistence.ArrayListPersistenciaBoletim;

public class BoletimDao {

	ArrayListPersistenciaBoletim db;
	
	public BoletimDao (ArrayListPersistenciaBoletim db) {
		this.db = db; 
	}
	
	public removeAll() {
		db.removeAll();
	}
	
	public void remove(Integer Index) {
		db.remove(index);
	}
	
	public Boletim add(Boletim boletim) {
		return db.add(boletim);
	}
	
	public Boletim get(int index) {
		return db.get(index);
	}
}
