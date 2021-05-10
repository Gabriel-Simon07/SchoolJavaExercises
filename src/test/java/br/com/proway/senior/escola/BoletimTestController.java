package br.com.proway.senior.escola;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.proway.senior.escola.controller.BoletimController;
import br.com.proway.senior.escola.model.Aluno;
import br.com.proway.senior.escola.model.Boletim;
import br.com.proway.senior.escola.model.Materia;
import br.com.proway.senior.escola.model.Prova;

public class BoletimTestController {

	static BoletimController controller;
	
	@BeforeClass
	public static void SetUpBeforeClass() throws Exception{
		Aluno aluno = new Aluno(); 
			Integer periodo = 202105;
			Boletim boletim = new Boletim (aluno, periodo);
			controller = new BoletimController(boletim);
		}
		
	@Test
	public void testControllerNaoNull() {
		assertNotNull(controller);
	}
	
	@Test
	public void testAdicionarUmaProva() {
		controller.removeTodasProvas();
		Materia materia = new Materia();
		Prova prova = new Prova(2021015,controller.getBoletim().getAluno(), materia);		
		controller.getBoletim();
		controller.addProva(prova);
		assertEquals(1, (int) controller.getBoletim().getProvas().size());
	}
	
}