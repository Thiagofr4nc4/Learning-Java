package com.aulas.java.poo.labs28a33;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		aluno.setNomeAluno("Thiago");
		aluno.setDisciplina1("lógica de Programação");
		aluno.setDisciplina2("Introdução ao curso");
		aluno.setDisciplina3("Algoritimos");
		aluno.setMatricula(853931);
		
		System.out.println(aluno.getNomeAluno());
		System.out.println(aluno.getDisciplina1());
		System.out.println(aluno.getMatricula());
	}

}
