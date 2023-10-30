package com.aulas.java.poo.labs28a33;

public class TesteContaCorrente {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		conta.setNumeroConta(1234);
		conta.setSaldo(340);
		conta.setLimiteCredito(200);
		conta.setContaEspecial(false);
		
		conta.depositar(777);
		conta.saque(666);

	}

}
