package com.exercicios.java;
import java.util.Scanner;
public class Aula15_Exercicio11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Me informe quanto você ganha para saber o seu reajuste.");
		double salario = scanner.nextDouble();
		
		if (salario <= 280){
			double aumento20 = (salario*0.2)+salario;
			System.out.println("Seu salário irá aumentar para: " + aumento20);
		} else if (salario > 280 && salario <= 700) {
			double aumento15 = (salario*0.15)+salario;
			System.out.println("Seu salário irá aumentar para: " + aumento15);
		} else if (salario > 700 && salario <= 1500) {
			double aumento10 = (salario*0.10)+salario;
			System.out.println("Seu salário irá aumentar para: " + aumento10);

	}     else if (salario > 1500) {
			double aumento5 = (salario*0.05)+salario;
			System.out.println("Seu salário irá aumentar para: " + aumento5);
		
}

}
}