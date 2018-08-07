package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardadorDeReferencias {

	public static void main(String[] args) {
		GuardadorDeReferencias guardador = new GuardadorDeReferencias();
		Conta cc = new ContaCorrente(234, 1212);
		guardador.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(564, 9889);
		guardador.adiciona(cc2);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = (Conta) guardador.getReferencia(0);
		System.out.println(ref.getNumero());
		
	}

}
