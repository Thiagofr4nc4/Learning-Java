package com.aulas.java.poo.labs28a33;

public class Lampada {
	private String modelo;
	private String tensao;
	private int potencia;
	private String cor;
	private int garantiaMeses;
	
	public String getModelo() {
		return modelo;
	}
	
	public String getTensao() {
		return tensao;
	}
	
	public int getPotencia() {
		return potencia;
	}
	
	public String getCor() {
		return cor;
	}
	
	public int getGarantiaMeses() {
		return garantiaMeses;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setTensao(String tensao) {
		this.tensao = tensao;
	}
	
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setGarantiaMeses(int garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}
	
	void ligarLampada(){
		System.out.println("Ligar lampada");
	}
	
	void desligarLampada(){
		System.out.println("Desligar lampada");
	}
}
