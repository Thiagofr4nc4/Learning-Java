package com.aulas.java.poo.labs25;

public class ContaBancaria {

	public static void main(String[] args) {
		 ContaCorrente minhaConta = new ContaCorrente();
	        minhaConta.numeroConta = 1234;
	        minhaConta.saldo = 1000.0; 
	        minhaConta.contaEspecial = true; 
	        minhaConta.limiteCredito = 500.0; 
	        
	        double depositar300 = minhaConta.depositar(300);
	        
	        double saque700 = minhaConta.saque(1500);
	        
	        double saldoAtual = minhaConta.consultarSaldo();
	        
	}

}
