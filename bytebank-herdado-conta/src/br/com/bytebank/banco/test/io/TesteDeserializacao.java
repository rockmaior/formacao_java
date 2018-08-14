package br.com.bytebank.banco.test.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteDeserializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Cliente cliente = new Cliente();
		cliente.setCpf("12345678999");
		cliente.setNome("Reginaldo");
		cliente.setProfissao("Militar");
		
		ContaCorrente cc = new ContaCorrente(900, 98765);
		cc.setTitular(cliente);
		cc.deposita(3000.0);
		
		//A - Transformar um objeto em fluxo binario
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();
	}

}
