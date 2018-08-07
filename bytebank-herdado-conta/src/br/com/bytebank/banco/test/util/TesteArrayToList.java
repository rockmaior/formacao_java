package br.com.bytebank.banco.test.util;

import java.util.Arrays;
import java.util.List;

public class TesteArrayToList {

	public static void main(String[] args) {
		List<String> argumentos = Arrays.asList(args);

		System.out.println(argumentos.get(0));
	}

}
