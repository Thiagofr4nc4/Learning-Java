package com.exercicios.java;
import java.util.Scanner;

public class Aula15_Exercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite um numero: ");
		int num = scanner.nextInt();
		
		if(num > 0) {
			System.out.println("O numero " + num + " é positivo");
			
		} else {
			System.out.println("O numero " + num + " é negativo");
		}
		

	}

}
