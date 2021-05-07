package br.com.proway.senior.escola.model;

/**
 * 
 * Pessoa que estuda na escola.
 * 
 * Um Aluno é uma pessoa que estuda na escola. O Aluno frequenta uma Turma 
 * {@link Turma} tem Notas {@link Nota} e Boletim {@link Boletim}.
 * 
 * @author Gabriel Simon <gabrielsimon775@gmail.com>
 *@see Boletim
 *@see Nota
 *@see Turma
 */
public class Aluno { 
	
	String nome;
	
	/**
	 * Último sobrenome do aluno.
	 */
	String sobrenome;

	/**
	 * Primeiro nome do aluno.
	 */
	
	/**
	 * Idade do aluno. 
	 */
	Integer idade;
	
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
	public void setNome(String nome)throws Exception {
		if(nome.matches(".*[0-9!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]+.*")) {
			throw new Exception ("Não utilize números e nem caracteres especiais no nome");		
		}else {			
			this.nome = nome;
		}
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

}
