package br.com.proway.senior.escola;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.proway.senior.escola.model.Aluno;

public class AlunoTest {

	@Test
	public void testSetNomeComNumero() throws Exception {
		Aluno aluno = new Aluno();
		aluno.setNome("Gabriel132");
		assertNotNull(aluno.getNome());
	}

	@Test
	public void testSetNomeSemNumero() throws Exception{
		Aluno aluno = new Aluno();
		aluno.setNome("Gabriel1");
		assertNotNull(aluno.getNome());
	}
	
	@Test (expected = Exception.class)
	public void testIdadeMaiorQue130() throws Exception{
		Aluno aluno = new Aluno();
		aluno.setIdade(12222);				
	}
	
	@Test
	public void testIdadeValida() throws Exception{
		Aluno aluno = new Aluno();
		aluno.setIdade(20);
	}
	
	@Test
	public void test1IdadeValida() throws Exception{
		Aluno aluno = new Aluno();
		aluno.setIdade(20);
		assertEquals(20,(int) aluno.getIdade());
	}
	
}
