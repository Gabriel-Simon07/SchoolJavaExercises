package br.com.proway.senior.escola;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.proway.senior.escola.model.Aluno;

public class AlunoTest {

	@Test(expected = Exception.class)
	public void testSetNomeComNumero() throws Exception {
		Aluno aluno = new Aluno() ;
		aluno.setNome("Gabriel132");	
	}
	@Test
	public void testSetNomeSemNumero() {
		Aluno aluno = new Aluno();
		try {			
			aluno.setNome("Gabriel");
		}catch(Exception ex){
			ex.printStackTrace();
		}		
		assertNotNull(aluno.getNome());
	}

}
