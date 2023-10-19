package com.aulas.java.poo.construtores;

public class Carro2 {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	Carro2(){}

	public Carro2(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
		
		System.out.println(this.marca);
		System.out.println(this.modelo);
		System.out.println(this.numPassageiros);
		System.out.println(capCombustivel);
		System.out.println(consumoCombustivel);
	}

	public Carro2(String marca, String modelo, int numPassageiros) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println(this.marca);
		System.out.println(this.modelo);
		System.out.println(this.numPassageiros);
	}



	
}
