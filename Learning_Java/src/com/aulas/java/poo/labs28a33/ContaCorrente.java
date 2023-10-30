package com.aulas.java.poo.labs28a33;

public class ContaCorrente {
	private int numeroConta;
	private double saldo;
	private boolean contaEspecial;
	private double limiteCredito;
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public boolean isContaEspecial() {
		return contaEspecial;
	}
	
	public double getLimiteCredito() {
		return limiteCredito;
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void setContaEspecial(boolean contaEspecial) {
		this.contaEspecial = contaEspecial;
	}
	
	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
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
	
	double depositar(double valorDeposito){
		   saldo = saldo + valorDeposito; // Adicione o valor ao saldo atual
		   System.out.println("Seu novo saldo após o deposito é de: " + saldo);
		return saldo;
	}
}
