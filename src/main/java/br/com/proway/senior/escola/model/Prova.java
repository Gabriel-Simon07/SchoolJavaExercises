package br.com.proway.senior.escola.model;

/**
 * A avaliação do desempenho do Aluno em uma Materia.
 * 
 * A prova registra uma avalição realizada pelo Aluno {@link Aluno}relativo ao
 * conhecimento de uma máteria. O aluno poderá realizar várias avaliações da
 * mesma matéria. A média ponderada das notas das provas é registrada no
 * {@link Boletim} verifica se o aluno foi aprovado.
 * 
 * @author Gabriel.Simon
 * @see Aluno;
 * @see Boletim
 *
 */
public class Prova {

	private Integer periodo;

	private Aluno aluno;

	private Materia materia;

	private double nota;

	/**
	 * Avaliação de desempenho do aluno.
	 *
	 * No construtor da Prova não atribui-se valor para a nota para que seja
	 * possível a criação de provas para depois serem atribuídas as notas.
	 * 
	 * @param periodo Periodo no formato YYYYMMDD
	 * @param aluno   Aluno que realizou a prova
	 * @param materia Materia da prova
	 */
	public Prova(Integer periodo, Aluno aluno, Materia materia) {
		this.periodo = periodo;
		this.aluno = aluno;
		this.materia = materia;
	}

	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	/**
	 * Valodar da avaliação do aluno.
	 * 
	 * @return
	 */
	public double getNota() {
		return nota;
	}

	/**
	 * Determina a avaliação do aluno.
	 * 
	 * Não pode ser menor que 0 nem maior que o atributo Materia.notaMaxim
	 * @param nota
	 */
	public void setNota(double nota)throws Exception{
		if(nota < 0 || nota > this.materia.notaMaxima)
			throw new Exception("Valor da nota inválido");
		this.nota = nota;
	}
}
