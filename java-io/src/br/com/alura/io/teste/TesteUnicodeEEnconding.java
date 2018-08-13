package br.com.alura.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEnconding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String c = "ç";
		System.out.println(c.codePointAt(0));

		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());

		byte[] bytes = c.getBytes("UTF-16");
		String nC = new String(bytes, "windows-1252");
		System.out.println(bytes.length + " Bytes UTF-16  " + nC);

		bytes = c.getBytes("windows-1252");
		nC = new String(bytes, "windows-1252");
		System.out.println(bytes.length + " Bytes windows-1252  " + nC  );

		bytes = c.getBytes(StandardCharsets.US_ASCII);
		nC = new String(bytes, "windows-1252");
		System.out.println(bytes.length + " Bytes ASCII  " + nC  );

	}

}
