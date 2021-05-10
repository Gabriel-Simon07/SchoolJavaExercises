package br.com.proway.senior.escola.controller;

import java.util.ArrayList;

import br.com.proway.senior.escola.model.Boletim;
import br.com.proway.senior.escola.model.Prova;
import br.com.proway.senior.escola.model.ProvaDao;

public class BoletimController {
	
	private Boletim boletim;
	
	public BoletimController(Boletim boletimEntrada) {
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
		ArrayList<Prova> provas = boletim.getProvas();
		provas.add(prova);
		this.calcularMedia();
	}
	
	/**
	 * Remove uma avaliação do boletim.
	 * 
	 * Ao remover uma prova, a média é recalculada.
	 * 
	 * @return
	 */
	public void removeProva(int index) {
		try {
			ProvaDao provaDao = new ProvaDao(boletim);
			provaDao.remove(index);																					
		}catch(Exception e){
			System.out.println("Prova não removida. Erro : " + e.getMessage());
		}
		this.calcularMedia();
	}
	

	/**
	 * Remove todas as provas
	 * 
	 * @return
	 * 
	 */
	public void removeTodasProvas() {
		 ProvaDao provaDao = new ProvaDao(boletim);
		 provaDao.removeAll();
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
		return boletim;
	}	
}
