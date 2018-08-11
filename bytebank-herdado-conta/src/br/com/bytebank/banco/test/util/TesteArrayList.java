package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
//		ArrayList<Conta> lista = new ArrayList<Conta>(); //Usa array por baixo
//		List<Conta> lista = new LinkedList<>(); // lista linkada
		List<Conta>lista = new Vector<>(); //usa array por baixo, mas tbm eh threadsafe
//		Collection<Conta> lista = new Vector<>();
		Conta cc = new ContaCorrente(1234, 4321);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(5678, 8765);
		lista.add(cc2);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		System.out.println("Tamanho: " + lista.size());

		Conta cc3 = new ContaCorrente(33, 311);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(33, 322);
        lista.add(cc4);
        
        for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
        
        System.out.println("____________________________");
        
        for (Object oRef : lista) {
			System.out.println(oRef);
		}
		
	}

}
