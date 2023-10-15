package com.aulas.java.poo.labs25;

public class ContaCorrente {
	int numeroConta;
	double saldo;
	boolean contaEspecial;
	double limiteCredito;
	
	double depositar(double valorDeposito){
		   saldo = saldo + valorDeposito; // Adicione o valor ao saldo atual
		   System.out.println("Seu novo saldo após o deposito é de: " + saldo);
		return saldo;
	}
	double saque(double valorSaque){
		if(valorSaque > saldo){
			System.out.println("Você não possui saldo suficiente para o valor digitado");
		}else {
		saldo = saldo - valorSaque;
		System.out.println("Seu novo saldo após o saque é de: " + saldo);
		}
		
		
		return saldo;
	}
	
	double consultarSaldo(){
		System.out.println("Seu saldo atual é de: " + saldo);
		return saldo;
	}
}
