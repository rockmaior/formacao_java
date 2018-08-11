package br.com.alura.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws Exception {
		
		BufferedWriter fw = new BufferedWriter(new FileWriter("Lorem3.txt"));
//		FileWriter fw = new FileWriter("Lorem3.txt");
		String linha = "Lorem Ipsum Dolor consectur sit amet";
		fw.write(linha);
//		fw.write(System.lineSeparator());
		fw.newLine();
		fw.write("Reginaldo Ribeiro");
		
		
		fw.close();
	}

}
