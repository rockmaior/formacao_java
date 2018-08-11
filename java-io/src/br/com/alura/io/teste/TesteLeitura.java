package br.com.alura.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("Lorem.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		String linha = br.readLine();

		
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();
	}

}
