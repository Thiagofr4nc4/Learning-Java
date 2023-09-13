package com.exercicios.java;
import java.util.Scanner;
public class Aula15_Exercicio4 {

	//Informar se a letra é vogal ou consoante 
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite uma letra: ");
		String letra = scanner.nextLine();
		
		switch(letra) {
		case "A":
			System.out.println(letra + " é uma vogal");
			break;
		case "E":
			System.out.println(letra + " é uma vogal");
			break;
		case "I":
			System.out.println(letra + " é uma vogal");
			break;
		case "O":
			System.out.println(letra + " é uma vogal");
			break;
		case "U":
			System.out.println(letra + " é uma vogal");
			break;
			default:
				System.out.println(letra + " é uma consoante");
		}
		
	}

}
