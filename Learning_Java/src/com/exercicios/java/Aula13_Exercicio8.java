package com.exercicios.java;
import java.util.Scanner;

public class Aula13_Exercicio8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite seu valor ganho por hora");
		double valorHora = scanner.nextDouble();
		
		System.out.println("Agora me informe quantas horas você trabalha no mês");
		double horasTrab = scanner.nextDouble();
		
		double salario = valorHora * horasTrab;
		
		System.out.println("Seu salário bruto é de: " + salario);
	}

}
