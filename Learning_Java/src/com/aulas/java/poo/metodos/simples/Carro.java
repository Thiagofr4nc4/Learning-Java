package com.aulas.java.poo.metodos.simples;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;


	void exibirAutonomia(){
		
			System.out.println("A autonimia do carro é: " + capCombustivel * consumoCombustivel + "km");
	}
	double obterAutonomia() {
		
		System.out.println("Chamando o doutor Hanzs Schucrutes");
		
		return capCombustivel * consumoCombustivel;
	}
}
