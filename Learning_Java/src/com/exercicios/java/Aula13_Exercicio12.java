package com.exercicios.java;
import java.util.Scanner;
public class Aula13_Exercicio12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite sua altura");
		double altura = scanner.nextDouble();
		
		double peso = (72.7*altura)-58;
		
		System.out.println("Seu peso ideal seria de: " + peso);

	}

}
