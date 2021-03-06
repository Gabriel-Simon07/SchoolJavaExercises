package br.com.proway.senior.escola.controller;

import br.com.proway.senior.escola.model.Prova;
import br.com.proway.senior.escola.model.ProvaDao;
import br.com.proway.senior.escola.persistence.ArrayListPersistenceProva;

public class ProvaController {

	private ProvaDao provaDao;
	
	private Prova prova;

	private ArrayListPersistenceProva dbProvas = new ArrayListPersistenceProva();
	
	public ProvaController(Prova prova) {
		this.provaDao = new ProvaDao(dbProvas);
		this.prova = prova;
	}
	
	public ProvaController(int index) {
		this.provaDao = new ProvaDao(dbProvas);
		this.prova = provaDao.get(index);
	}
	
	public Prova addProva() {
		if(this.prova.getId() != null) {
			return this.provaDao.add(this.prova);			
		}
		return this.prova;
	}
	
	public void removeProva() {
		try {
			provaDao.remove(prova.getId());
		}catch(Exception e) {
			System.out.println("Prova não removida. Erro : " + e.getMessage());
		}
	
	}
	public Prova get(Integer id) {
		return this.provaDao.get(id);
	}
}
