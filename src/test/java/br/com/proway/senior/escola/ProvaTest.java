package br.com.proway.senior.escola;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.proway.senior.escola.model.Aluno;
import br.com.proway.senior.escola.model.Materia;
import br.com.proway.senior.escola.model.Prova;

public class ProvaTest {
	
	static Prova prova;

		@BeforeClass
		public static void createProva(){
			Integer periodo = 20210502;
			Materia materia = new Materia();
			Aluno aluno = new Aluno();
			prova = new Prova (periodo, aluno, materia);		
	}
		
	@Test
	public void testProva() {
		assertNotNull(prova);
	}
	
	@Test (expected = Exception.class)
	public void testSetGetNotaIncorreta()throws Exception{
		prova.setNota(-10.0);
	}
	
	@Test (expected = Exception.class)
	public void testSetGetNotaCorreta() throws Exception{
		try {
			prova.setNota(10.0);
		}catch(Exception e){
			fail(e.getMessage());
		}
		assertEquals(10.0, (double) prova.getNota(), 0.01);
	}																			
}
