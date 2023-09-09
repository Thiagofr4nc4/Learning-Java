package com.aulas.java;

public class Arrays {

	public static void main(String[] args) {
		double[] temperaturas = new double[365];
		temperaturas[0] = 31.5;
		temperaturas[1] = 24.6;
		temperaturas[2] = 32.6;
		temperaturas[3] = 25.7;
		temperaturas[4] = 16.8;
		
		System.out.println("O valor da temperatura no dia 1 foi: " + temperaturas[0]);
		
		System.out.println("O tamanho do array é: " + temperaturas.length);
		
		System.out.println("O valor do array é: " + temperaturas);
		
		for (int i=0; i<temperaturas.length; i++) {
			System.out.println("O valor da temperatura do dia " + (i+1) + "é:" + temperaturas[i]);


	}

	
	}
	}
