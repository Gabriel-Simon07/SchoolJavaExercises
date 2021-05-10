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
	private Integer id;
	private Integer periodo;
	private Double media;
	private ArrayList<Prova> provas;

	/**
	 * Cria um novo Boletim
	 * 
	 * O Boletim é criado a partir de um aluno e um período. Conforme as provas são
	 * adicionadas, realiza-se o cálculo atualizado da média.
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
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Período do formato YYYYMM
	 * 
	 * @return
	 */
	public Integer getPeriodo() {
		return periodo;
	}

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
	
	public void setMedia(Double d){
																											
	}
	
	public void resetProvas() {
		this.provas = new ArrayList<Prova>();																								
	}

	

																								

	

	
}
