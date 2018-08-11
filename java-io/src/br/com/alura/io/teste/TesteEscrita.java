package br.com.alura.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TesteEscrita {

	public static void main(String[] args) throws Exception {
		OutputStream fos = new FileOutputStream("Lorem2.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		String linha = "Lorem Ipsum Dolor consectur sit amet";
		bw.write(linha);
		bw.newLine();
		bw.write("Reginaldo Ribeiro Araujo");
		
//		while (linha != null) {
//			System.out.println(linha);
//			linha = br.readLine();
//		}
		
		bw.close();
	}

}
