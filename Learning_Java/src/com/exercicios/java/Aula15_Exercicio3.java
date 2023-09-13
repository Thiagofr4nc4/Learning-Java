package com.exercicios.java;
import java.util.Scanner;

public class Aula15_Exercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("você se considera do sexo Masculino, Feminino ou Indefinido ?");
		String genero = scanner.nextLine();
		
		switch(genero){
			case "M":
				System.out.println("Masculino");
				break;
			case "F":
				System.out.println("Feminino");
				break;
			case "i":
				System.out.println("Indefinido");
				break;
			default:
				System.out.println("Genero não encontrado.");
	}

	}

}
