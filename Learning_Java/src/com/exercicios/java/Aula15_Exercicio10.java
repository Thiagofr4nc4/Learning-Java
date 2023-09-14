package com.exercicios.java;
import java.util.Scanner;

public class Aula15_Exercicio10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Você estuda em qual periodo ?");
		String periodo = scanner.nextLine();
		
		switch(periodo) {
		case "M":
		System.out.println("Bom Dia :D");
		break;
		case "V":
		System.out.println("Boa Tarde :D");
		break;
		case "N":
		System.out.println("Boa Noite :D");
		break;
		default:
			System.out.println("Turno inválido");
		}

	}

}
