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
	 * O Boletim é criado apartir da
	 * @param aluno
	 * @param periodo
	 * @param media
	 * @param provas
	 */
	
	
	public Boletim(Aluno aluno, Integer periodo, Double media, ArrayList<Prova> provas) {
		super();
		this.aluno = aluno;
		this.periodo = periodo;
		this.media = media;
		this.provas = new ArrayList<Prova>();
	}

	/**
	 * Aluno do boletim
	 * @return
	 */
	public Aluno getAluno() {
		return aluno;
	}
	
	/**
	 * Período do formato YYYYMM
	 * @return
	 */
	public Integer getPeriodo() {
		return periodo;
	}
	
	public Double getMedia() {
		return media;
	}
	public ArrayList<Prova> getProvas() {
		return provas;
	}

}
