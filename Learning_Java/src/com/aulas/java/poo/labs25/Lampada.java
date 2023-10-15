package com.aulas.java.poo.labs25;


public class Lampada {
	  boolean ligada;

		    public Lampada() {
		        // Inicialmente, a lâmpada está desligada
		        ligada = false;
		       
		    }

		    // Método para ligar a lâmpada
		    public void ligar() {
		        ligada = true;
		    	   System.out.println("A lampada foi ligada");
		    }

		    // Método para desligar a lâmpada
		    public void desligar() {
		        ligada = false;
		        System.out.println("A lampada foi desligada");
		    }

		    // Método para verificar o estado da lâmpada
		    public boolean estaLigada() {
		    	System.out.println("A lampada está ligada ? " + ligada);
		    	return ligada;
		        
		    }
		}

