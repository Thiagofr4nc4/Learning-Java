package com.aulas.java.poo.getandset;

import java.util.Scanner;

public class TesteCarro {

	public static void main(String[] args) {
		Carro carro = new Carro();
		Scanner scanner = new Scanner(System.in);
		
		carro.setMarca("Mitsubishi");
		carro.setModelo("Lancer");
		carro.setNumPassageiros(5);
		
		System.out.println(carro.getMarca());
		System.out.println(carro.getModelo());
		System.out.println(carro.getNumPassageiros());
	}

}
