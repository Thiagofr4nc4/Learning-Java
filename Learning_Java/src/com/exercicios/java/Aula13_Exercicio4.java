package com.exercicios.java;
import java.util.Scanner;
public class Aula13_Exercicio4 {

	//Faça um programa que peça 4 notas e diga a média, tambem informando
	//se a pessoa foi aprovada ou não
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite sua nota na primeira unidade: ");
		int nota1 = scanner.nextInt();
		
		System.out.println("Digite sua nota da segunda unidade: ");
		int nota2 = scanner.nextInt();
		
		System.out.println("Digite sua nota da segunda unidade: ");
		int nota3 = scanner.nextInt();
	
		System.out.println("Digite sua nota da segunda unidade: ");
		int nota4 = scanner.nextInt();
		
		int media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("Sua média foi: " + media);
		
		if(media < 6)
		{System.out.println("Você foi reprovado");
		
		} else {
			System.out.println("Você foi aprovado");
		}
		
	} 
	

}
