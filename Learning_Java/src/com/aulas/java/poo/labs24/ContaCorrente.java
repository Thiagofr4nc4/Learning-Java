package com.aulas.java.poo.labs24;

import java.util.Scanner;

public class ContaCorrente {
		String banco;
		String agencia;
		String conta;
		boolean contaEspecial;
		double limite;
		String usuario;


		public static void main(String[] args) {

			ContaCorrente conta = new ContaCorrente();
			conta.banco = "Nubank";
			conta.agencia = "0001";
			conta.contaEspecial = true;
			conta.limite = 295.8;
			conta.usuario = "Thiago";
			
			System.out.println(conta.banco);
			System.out.println(conta.usuario);
			System.out.println(conta.contaEspecial);
			System.out.println(conta.limite);
			
			
			
}
		
}
