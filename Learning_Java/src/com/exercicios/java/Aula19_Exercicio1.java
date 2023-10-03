package com.exercicios.java;

public class Aula19_Exercicio1 {
	public static void main(String[] args) {
		int[] A = new int[5];
		A [0] = 1;
		A [1] = 2;
		A [2] = 3;
		A [3] = 4;
		A [4] = 5;
		
		int[] B = A;
		
		 // Imprima os valores de A com base em B
        for (int i = 0; i < B.length; i++) {
            System.out.println("A[" + i + "] = " + B[i]);
        }
		
	}
}
