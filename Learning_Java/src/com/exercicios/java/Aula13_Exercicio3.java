package com.exercicios.java;
import java.util.Scanner;

public class Aula13_Exercicio3 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Digite um numero");
			int num1 = scanner.nextInt();
			
			System.out.println("Digite outro numero");
			int num2 = scanner.nextInt();
			
			int resultado = num1 + num2;
			
			System.out.println("O resultado de sua soma foi: " + resultado);
	}

}
