package com.aulas.java;

import java.util.Scanner;

public class BreakeContinue {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		System.out.println("Digite um número");
		int num = scan.nextInt();
		
		System.out.println("Digite um limite");
		int max = scan.nextInt();
		
		for (int i = num; i<=max; i++) {
			
			if (i % 7 == 0) {
				System.out.println("O valor de i é: " +i);
				break;
			}
		}
		*/
		
		System.out.println("Digite um número");
		int num = scan.nextInt();
	
		System.out.println("Digite um limite");
		int max = scan.nextInt();
	
		for (int i = num; i<=max; i++) {
		
		if (i % 7 == 0) {
			System.out.println("O valor de i é: " +i);
			continue;
			}
		
		
			}
	

	}

}
