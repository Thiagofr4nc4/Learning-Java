package com.exercicios.java;

import java.util.Scanner;

public class Aula19_Exercicio6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[5]; 
		int[] vetorC = new int[vetorA.length];
		
				//receber valores para vetor A
				for(int i=0; i<vetorA.length; i++) {
				System.out.println("Entre com o valor da posição de A " + i);
				vetorA[i] = scan.nextInt();
		}
				System.out.println();
			
				//receber valores para vetor B
				for(int i=0; i<vetorB.length; i++) {
				System.out.println("Entre com o valor da posição de B " + i);
				vetorB[i] = scan.nextInt();	
			}
			
				System.out.print("Vetor A = ");
				for (int i=0; i<vetorB.length; i++) {
				System.out.print(vetorA[i]+ " " );
			}
				
				System.out.println();
				
				System.out.print("Vetor B = ");
				for (int i=0; i<vetorB.length; i++) {
					System.out.print(vetorB[i]+ " " );
				}
			
				 // Calcular vetorC
		        for (int i = 0; i < vetorC.length; i++) {
		            vetorC[i] = vetorA[i] - vetorB[i];
		        }

		        System.out.println();
		        
		        System.out.print("Vetor C = ");
		        for (int i = 0; i < vetorC.length; i++) {
		            System.out.print(vetorC[i] + " ");
		        }

	}

}
