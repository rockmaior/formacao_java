package br.com.alura.io.teste;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		
//		PrintStream ps = new PrintStream("lorem5.txt");
		
		PrintWriter ps = new PrintWriter("lorem4.txt", "UTF-8");
		
		ps.print("Você é especial!");
		ps.println();
		ps.print("Um coração.");
		
		
		ps.close();
	}

}
