package com.aulas.java.poo.construtores;

public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
	//	van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;

		System.out.println(van.numPassageiros);
		
		Carro van2 = new Carro("Fiat");
		van2.marca = "Fiat";
		System.out.println(van2.marca);
	}

}
