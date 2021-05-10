package br.com.proway.senior.escola.controller;

import java.util.ArrayList;

import br.com.proway.senior.escola.model.Boletim;
import br.com.proway.senior.escola.model.BoletimDao;
import br.com.proway.senior.escola.model.Prova;
import br.com.proway.senior.escola.persistence.ArrayListPersistenciaBoletim;

public class BoletimController {
	
	private Boletim boletim;
	
	private BoletimDao boletimDao;
	
	private ArrayListPersistenciaBoletim dbBoletim = new ArrayListPersistenciaBoletim ();	
	
	public BoletimController(Boletim boletimEntrada) {
		this.boletimDao = new  BoletimDao (dbBoletim);
		this.boletim = boletimEntrada;
	}	
	
	/**
	 * Adiciona uma avaliação ao boletim.
	 * 
	 * Ao adicionar a Prova, a média é recalculada.
	 * 
	 * 
	 * @param Prova
	 */
	public void addProva(Prova prova) {
		ProvaController provaController = new ProvaController(prova);
		if(prova.getId() != null) {
			provaController.addProva();
			}else {
				provaController.get(prova.getId());
			}
		boletim.getProvas().add(prova);
		this.calcularMedia();
	}
	
	public Boletim addBoletim() {
		if(this.boletim.getId() == null) {
			return this.boletimDao.add(this.boletim);
			}
		return this.boletim;
	}
	
	
	/**
	 * Remove uma avaliação do boletim.
	 * 
	 * Ao remover uma prova, a média é recalculada.
	 * 
	 * @return
	 */
	public void removeProva(int index) {
		ProvaController provaController = new ProvaController(index);
		provaController.removeProva();
		try {
			boletim.getProvas().remove(index);
			this.calcularMedia();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}		
	}
	

	/**
	 * Remove todas as provas
	 * 
	 * @return
	 * 
	 */
	public void removeTodasProvas() {
		 ArrayList<Prova> provas = this.boletim.getProvas();
		 
		 for(Prova prova : provas) {
			 ProvaController provaController  = new ProvaController(prova);
			 provaController.removeProva();
		 }
		  this.boletim.getProvas().clear();
		  this.calcularMedia();
	}
	/**
	 * Faz a média ponderada das provas.
	 * 
	 * Realiza o cálculo da média das notas das provas e atualiza o valor da média.
	 * 
	 */
	public void calcularMedia() {
		int pesosNotas = 0;
		Double somaNotas =  0.0;
		for(Prova prova : boletim.getProvas()) {
			somaNotas += prova.getNota() * prova.getPeso();
			pesosNotas += prova.getPeso();
		}
		boletim.setMedia(somaNotas / pesosNotas);
	}
	/**
	 * Retorna a média das provas atualizada.
	 * 
	 * @return
	 * 
	 * 
	 *         para ler uma media, voce tem que ter notas no array, depois voce soma
	 *         e faz a divisao pela quantidade de notas depositadas no array
	 */
	
	public Boletim getBoletim() {
		return this.boletim;
	}	
}
