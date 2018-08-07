package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<Conta>();
		Conta cc = new ContaCorrente(1234, 4321);
		Conta cc2 = new ContaCorrente(1234, 4321);

		lista.add(cc);

		/*
		 * boolean existe = lista.contains(cc2); System.out.println("Ja existe? " +
		 * existe);
		 */

		boolean igual = cc.equals(cc2);
		System.out.println(igual);

		for (Conta conta : lista) {
			System.out.println(conta);
		}

	}

}
