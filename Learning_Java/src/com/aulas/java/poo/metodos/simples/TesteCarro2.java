package com.aulas.java.poo.metodos.simples;

import com.aulas.java.poo.TesteCarro;

public class TesteCarro2 {

	public static void main(String[] args) {
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;

		//van.exibirAutonomia();
		
		double autonomia = van.obterAutonomia();
		//System.out.println(van.obterAutonomia());
		System.out.println(autonomia);
		
		double qtdCombustivel10 = van.calcularCombustivel(10);
		double qtdCombustivel15 = van.calcularCombustivel(15);
		
		System.out.println("qtdCombustivel 10: " + qtdCombustivel10);
		System.out.println("qtdCombustivel 15: " + qtdCombustivel15);
	}
	

}
