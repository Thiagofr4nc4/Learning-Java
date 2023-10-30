package com.aulas.java.poo.labs28a33;

public class TesteLampada {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		
		lampada.setCor("Rgb");
		lampada.setGarantiaMeses(12);
		lampada.setModelo("Caixinha de som");
		lampada.setPotencia(10);
		lampada.setTensao("5v");
	
		System.out.println(lampada.getModelo());
		System.out.println(lampada.getCor());
		System.out.println(lampada.getPotencia());
		lampada.ligarLampada();
		lampada.desligarLampada();
	}

}
