package com.aulas.java.poo;

public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 20.5;
		van.consumoCombustivel = 0.2;
		
		//System.out.println(van.marca);
		//System.out.println(van.numPassageiros);
		
		Carro fusca = new Carro();
		fusca.marca = "Volkswagen";
		fusca.modelo = "Fusca";
		fusca.numPassageiros = 4;
		fusca.capCombustivel = 15.7;
		fusca.consumoCombustivel = 3.3;
		
		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);
		System.out.println();
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
	}

}
