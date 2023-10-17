package com.aulas.java.poo.labs25;

public class TesteAluno {

	public static void main(String[] args) {
	Aluno aluno = new Aluno();
	aluno.nomeAluno = "Thiago";
	aluno.disciplina1 = "Introdução a lógica de programação";
	aluno.disciplina2 = "Seminário de intro ao curso";
	aluno.disciplina3 = "Tecnologia da inovação";
	aluno.notaDisciplina1 = 7.8;
	aluno.notaDisciplina2 = 9.3;
	aluno.notaDisciplina3 = 4.5;

	aluno.exibirNome();
	
	aluno.verificarAprovacao();
	/*aluno.notaDisciplina1(5);
	
	aluno.notaDisciplina2(0);*/
	}

}
