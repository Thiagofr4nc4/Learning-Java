package com.exercicios.java;
import java.util.Scanner;

//programa que leia dois numeros e imprima o maior deles 
public class Aula15_Exercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite um numero: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Digite outro numero: ");
		int num2 = scanner.nextInt();
		
		
		if(num1 > num2) {
			System.out.println("O maior numero digitado foi: " + num1);
		
		} else {
			System.out.println("O maior numero digitado foi: " + num2);
			
		}
		

	}

}
