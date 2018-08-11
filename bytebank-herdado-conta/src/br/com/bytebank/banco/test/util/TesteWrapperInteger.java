package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		
		//Testa autoboxing unboxing implicito
		Integer iRef = Integer.valueOf(31);
		int primitivo = new Integer(21);
		
		List<Integer> lista = new ArrayList<>();
		lista.add(iRef);
		lista.add(primitivo);
		
		int i1 = lista.get(0);
		int i2 = lista.get(1);
		
		System.out.println(i1 + "\n" + i2);
		
		//Testa autoboxing e unboxing explicito
		
		Integer valorRef = Integer.valueOf(33);
		int valorPri = valorRef.intValue();
		
		System.out.println(valorPri);
		
		//Testa o parsing
		Integer iParseado1 = Integer.valueOf("42");
		int iParseado2 = Integer.parseInt("44");
		
		System.out.println(iParseado1);
		System.out.println(iParseado2);
		
		//Verifica informacoes de Integer
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
	}

}
