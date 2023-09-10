package com.exercicios.java;
import java.util.Scanner;

public class Aula13_Exercicio5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite um valor em metros:");
		int metros = scanner.nextInt();
		
		int cent = metros * 100;
		
		System.out.println("O valor digitado em centimetros é de: " + cent + "cm");

	}

}
