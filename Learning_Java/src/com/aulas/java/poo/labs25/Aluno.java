package com.aulas.java.poo.labs25;

public class Aluno {
	String nomeAluno;
	String disciplina1;
	String disciplina2;
	String disciplina3;
	double notaDisciplina1;
	double notaDisciplina2;
	double notaDisciplina3;
	
	void exibirNome(){
		System.out.println("Nome do aluno: " + nomeAluno);
	}
	//Correção pega pelo chatGPT
	void verificarAprovacao() {
        verificarAprovacaoDisciplina(disciplina1, notaDisciplina1);
        verificarAprovacaoDisciplina(disciplina2, notaDisciplina2);
        verificarAprovacaoDisciplina(disciplina3, notaDisciplina3);
    }

    void verificarAprovacaoDisciplina(String disciplina, double nota) {
        System.out.println("A nota na matéria " + disciplina + " foi de: " + nota);
        System.out.println();
        if (nota < 5) {
            System.out.println("Aluno Reprovado em " + disciplina);
            System.out.println();
        } else {
            System.out.println("Aluno Aprovado em " + disciplina);
            System.out.println();
        }
    }
}




//Esse código eu quem fiz, mas estava duplicando codigo
	/*double notaDisciplina1(double notaDisciplina1) {
		System.out.println("A nota na " + disciplina1 + " foi de: " + notaDisciplina1);
		if (notaDisciplina1 < 5){
			System.out.println("Aluno Reprovado");
		} else {
			System.out.println("Aluno Aprovado");
		}
		return notaDisciplina1;
	}
	
	double notaDisciplina2(double nnotaDisciplina2) {
		System.out.println("A nota na " + disciplina2 + " foi de: " + notaDisciplina2);
		if (notaDisciplina2 < 5){
			System.out.println("Aluno Reprovado");
		} else {
			System.out.println("Aluno Aprovado");
		}
		return notaDisciplina2;
	}
	
	double notaDisciplina3(double notaDisciplina3) {
		System.out.println("A nota na " + disciplina3 + " foi de: " + notaDisciplina3);
		if (notaDisciplina3 < 5){
			System.out.println("Aluno Reprovado");
		} else {
			System.out.println("Aluno Aprovado");
		}
		return notaDisciplina3;
	}
}*/
