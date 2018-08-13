package br.com.alura.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Teste {

	public static void main(String[] args) throws UnsupportedEncodingException {
		System.out.println(Charset.defaultCharset());
		
		Charset utf8 = StandardCharsets.UTF_8;
		String s = "13º Órgão Oficial";
		
		byte[] bytes = s.getBytes(utf8);
		String s2 = new String(bytes, utf8);
		System.out.println(s2);
	}

}
