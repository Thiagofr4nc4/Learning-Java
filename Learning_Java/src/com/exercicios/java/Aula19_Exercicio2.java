package com.exercicios.java;

public class Aula19_Exercicio2 {

	public static void main(String[] args) {
	int[] A = new int [8];
		
		A[0] = 1;
		A[1] = 2;
		A[2] = 3;
		A[3] = 4;
		A[4] = 5;
		A[5] = 6;
		A[6] = 7;
		A[7] = 8;
		
		int[] B = new int [1]; // Declarar e inicializar o array B
		
		B[0] = A[7]*2;
		
		System.out.println(B[0]);
				
	}

}
