package br.com.proway.senior.escola.model;

import Tools.Validators;

/**
 * 
 * Pessoa que estuda na escola.
 * 
 * Um Aluno é uma pessoa que estuda na escola. O Aluno frequenta uma Turma
 * {@link Turma} tem Notas {@link Nota} e Boletim {@link Boletim}.
 * 
 * @author Gabriel Simon <gabrielsimon775@gmail.com>
 * @see Boletim
 * @see Nota
 * @see Turma
 */
public class Aluno {

	private String nome;

	private String sobrenome;

	private Integer idade;

	public String getNome() {
		return nome;
	}

	/**
	 * Define o primeiro nome do aluno.
	 * 
	 * Utilizar somente caracteres alfabéticos.
	 * 
	 * @throws Exception
	 */
	public void setNome(String nomeEntrada) throws Exception {
		if (!Validators.onlyValidChars(nomeEntrada)) {
			throw new Exception("Utilizar apenas letras no nome");
		}
		this.nome = nomeEntrada;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	/**
	 * Define o primeiro Sobrenome do aluno.
	 * 
	 * Utilizar somente caracteres alfabéticos.
	 * 
	 * @throws Exception
	 */
	public void setSobrenome(String sobrenomeEntrada) throws Exception {
		if (!Validators.onlyValidChars(sobrenomeEntrada)) {
			throw new Exception("Utilizar apenas letras no sobrenome");
		}
		this.sobrenome = sobrenomeEntrada;
	}

	public Integer getIdade() {
		return idade;
	}

	/**
	 * Define a idade do aluno.
	 * 
	 * Idade em anos. Deve ser um número inteiro entre 0 e 130.
	 * 
	 * @return Integer Idade
	 */
	public void setIdade(Integer idadeEntrada) throws Exception {
		if (idadeEntrada < 0 || idadeEntrada > 130) {
			throw new Exception("Idade precisa ser menor que 130");
		}
		this.idade = idadeEntrada;
	}

}
