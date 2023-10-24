package com.aulas.java.poo.getandset;

public class Carro {
	private String marca;
	private String modelo;
	private int numPassageiros;
	private double capCombustivel;
	private double consumoCombustivel;
	
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public int getNumPassageiros() {
		return numPassageiros;
	}
	public double getCapCombustivel() {
		return capCombustivel;
	}
	public double getConsumoCombustivel() {
		return consumoCombustivel;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}
	public void setCapCombustivel(double capCombustivel) {
		this.capCombustivel = capCombustivel;
	}
	public void setConsumoCombustivel(double consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}

	void acelerarCarro(){
		System.out.println("Acelerando o carro...");
	}
}
