package com.aulas.java.poo.labs28a33;

public class Aluno {
	private String nomeAluno;
	private String disciplina1;
	private String disciplina2;
	private String disciplina3;
	private int matricula;
	private double notaDisciplina1;
	private double notaDisciplina2;
	private double notaDisciplina3;
	
	public String getNomeAluno() {
		return nomeAluno;
	}
	
	public String getDisciplina1() {
		return disciplina1;
	}
	
	public String getDisciplina2() {
		return disciplina2;
	}
	
	public String getDisciplina3() {
		return disciplina3;
	}
	
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	
	public void setDisciplina1(String disciplina1) {
		this.disciplina1 = disciplina1;
	}
	
	public void setDisciplina2(String disciplina2) {
		this.disciplina2 = disciplina2;
	}
	
	public void setDisciplina3(String disciplina3) {
		this.disciplina3 = disciplina3;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
}
