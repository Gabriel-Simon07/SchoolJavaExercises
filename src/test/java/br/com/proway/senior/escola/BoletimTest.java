package br.com.proway.senior.escola;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.proway.senior.escola.model.Aluno;
import br.com.proway.senior.escola.model.Boletim;
import br.com.proway.senior.escola.model.Materia;
import br.com.proway.senior.escola.model.Prova;

public class BoletimTest {
	
	static Boletim boletim;
	private static int periodoPadrao;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		Aluno aluno = new Aluno();
		Integer periodo = periodoPadrao;
		boletim = new Boletim(aluno, periodo);
	}
	@Test
	public void testBoletim() {
		assertNotNull(boletim);
	}

	@Test
	public void testGetAluno() {
		assertNotNull(boletim.getAluno());
	}
	
	@Test
	public void testGetPeriodo() {
		assertEquals(periodoPadrao, (int)boletim.getPeriodo());
	}
	
	@Test
	public void testGetMedia() {
		 boletim.removeTodasProvas();
		 Materia materia = new Materia();
		 Prova prova = new Prova(periodoPadrao, boletim.getAluno(), materia);
		 try {
			 prova.setNota(10.0);
			 boletim.addProva(prova)																									;
		 }catch(Exception e){
			fail(e.getMessage());
		 }
		 assertEquals(10.0, boletim.getMedia(), 0.01);
	}
	
	@Test
	public void testAddProva() {
		Materia materia = new Materia();
		Prova prova = new Prova(periodoPadrao, boletim.getAluno(), materia);
		boletim.addProva(prova);
		assertEquals(1, (int) boletim.getProvas().size());		
	}
	
	@Test
	public void testRemoveProva() {
		Materia materia = new Materia();
		Prova prova = new Prova(periodoPadrao, boletim.getAluno(), materia);
		boletim.removeTodasProvas();
		boletim.addProva(prova);
		boletim.addProva(prova);
		boletim.removeProva(4);
		assertEquals(1, boletim.getProvas().size());
	}
	
	@Test
	public void testRemoveTodasProvas() {
		Materia materia = new Materia();
		Prova prova = new Prova(periodoPadrao, boletim.getAluno(), materia);
		boletim.addProva(prova);
		boletim.removeTodasProvas();
		assertFalse(boletim.getProvas().size() > 0);
	}
			
}
