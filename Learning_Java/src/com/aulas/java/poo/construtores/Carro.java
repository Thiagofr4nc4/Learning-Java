package com.aulas.java.poo.construtores;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;


	Carro(){
		numPassageiros = 4;
		System.out.println("A classe carro foi instanciada");
	}
	
	Carro(String marca_){
		marca = marca_;
	}
	
	
	void exibirAutonomia(){
		
			System.out.println("A autonimia do carro é: " + capCombustivel * consumoCombustivel + "km");
	}
	double obterAutonomia() {
		
		System.out.println("Chamando o doutor Hanzs Schucrutes");
		
		return capCombustivel * consumoCombustivel;
	}
	double calcularCombustivel(double km){
		
		double qtdCombustivel =  km/consumoCombustivel;
		
		return qtdCombustivel;
	}
}
