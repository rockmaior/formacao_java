package br.com.alura.io.teste;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Properties;

public class TesteLeituraEscritaProp {

	public static void main(String[] args) throws IOException {

		Properties propRead = new Properties();
		propRead.setProperty("login", "alura");
		propRead.setProperty("senha", "aluraPass");

		Writer writer = new PrintWriter("conf.properties");
		// Escrita de propriedades
		propRead.store(writer, "Arquivo de Teste");
		
		propRead.load(new FileReader("conf.properties"));
		String login = propRead.getProperty("login");
		String senha = propRead.getProperty("senha");
		
		System.out.println("LOGIN: " + login + "\n" + "SENHA: " + senha);

	}

}
