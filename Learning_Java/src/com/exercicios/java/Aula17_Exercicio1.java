package com.exercicios.java;

import java.util.Scanner;

public class Aula17_Exercicio1 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
		boolean infoCerta = false;
		
		do { 
		System.out.println("Digite um numero entre 0 e 10");
		int numero = scan.nextInt();
		
		if (numero >0 && numero <10) {
			infoCerta = true;
		}
		
		
	} while(!infoCerta);
	
	
		

	}

}
