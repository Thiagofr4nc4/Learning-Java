package com.aulas.java.poo.usandothis;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;


	
	public Carro() {
			
	}


	
	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}



	
	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando construtor com 3 parametros");
		System.out.println(this.marca);
		System.out.println(this.modelo);
		System.out.println(this.numPassageiros);
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
