package br.com.bytebank.banco.test;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {
		int[] idades = new int[5];
		
		/*idades[0]=27;
		idades[1]=28;
		idades[2]=18;
		idades[3]=38;
		idades[4]=48;
		
		int idade4 = idades[3];
		
		System.out.println(idade4);
		System.out.println(idades.length);
		*/
		
		for (int i = 0; i < idades.length; i++) {
			idades[i]=i*i;
		}
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
	}

}
