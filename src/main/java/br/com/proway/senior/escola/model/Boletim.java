package br.com.proway.senior.escola.model;

import java.util.ArrayList;

/**
 * Reúne as {@link Prova} de um {@Link Aluno}.
 * 
 * O boletim possui uma lita de {@link Prova} e é referente a um periodo. para
 * cada período de um {@link Aluno}. Para cada período é calculada a média das
 * provas que resulta na nota do boletim.
 * 
 * @author Gabriel.Simon
 *
 */
public class Boletim {
	private Aluno aluno;
	private Integer periodo;
	private Double media;
	private ArrayList<Prova> provas;
	
	
	/**
	 * Cria um novo Boletim
	 * 
	 * O Boletim é criado a partir de um aluno e um período. Conforme as provas são adicionadas,
	 * realiza-se o cálculo atualizado da média.
	 * 
	 * @param aluno
	 * @param periodo
	 * @param media
	 */
	public Boletim(Aluno aluno, Integer periodo) {
		super();
		this.aluno = aluno;
		this.periodo = periodo;
		this.media = 0.0;
		this.provas = new ArrayList<Prova>();
	}

	/**
	 * Aluno do boletim
	 * 
	 * @return
	 */
	public Aluno getAluno() {
		return aluno;
	}
	
	/**
	 * Período do formato YYYYMM
	 * 
	 * @return
	 */
	public Integer getPeriodo() {
		return periodo;
	}
	
	/**
	 * Retorna a média das provas atualizada.
	 * 
	 * @return
	 * 
	 * 
	 * para ler uma media, voce tem que ter notas no array, depois voce soma e faz a divisao pela quantidade
	 * de notas depositadas no array
	 */
	public Double getMedia() {
		return media;
	}
	
	/**
	 * Retorna todas as provas.
	 * 
	 * @return ArrayList<Prova>
	 */
	public ArrayList<Prova> getProvas() {
		return provas;
	}
	
	/**
	 * Adiciona uma avaliação ao boletim.
	 * 
	 * Ao adicionar a Prova, a média é recalculada.
	 * 
	 * 
	 * @param Prova
	 */
	public void addProva(Prova prova){		
		this.addProva(prova);		
		
	}
	
	/**
	 * Remove uma avaliação do boletim.
	 * 
	 * Ao remover uma prova, a média é recalculada.
	 * 
	 * @return 
	 */
	public void removeProva(Prova prova) {
		
	}
	
	/**
	 * Faz a média ponderada das provas.
	 * 
	 * Realiza o cálculo da média das notas das provas e atualiza o valor da média.
	 * 
	 */
	public void calcularMedia() {
		for(int i = 0; i < provas.size() ; i++) {
			
		}
	}
	
	/**
	 * Remove todas as provas
	 * 
	 * @return
	 * 
	 */
	public void removeTodasProvas() {
		this.provas = new ArrayList<Prova>();
		
	}
}
