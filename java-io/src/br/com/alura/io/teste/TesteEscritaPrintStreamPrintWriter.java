package br.com.alura.io.teste;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		
//		PrintStream ps = new PrintStream("lorem5.txt");
		
		PrintWriter ps = new PrintWriter("lorem4.txt");
		
		ps.print("Lorem ipsum dolor consectur amet..");
		ps.println();
		ps.print("Reginaldo Ribeiro");
		
		
		ps.close();
	}

}
