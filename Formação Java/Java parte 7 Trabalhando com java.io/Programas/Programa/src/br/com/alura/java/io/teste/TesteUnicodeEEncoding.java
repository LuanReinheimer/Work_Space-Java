package br.com.alura.java.io.teste;

public class TesteUnicodeEEncoding {

	public static void main(String[] args) {

		String s = "C";
		
		System.out.println(s.codePointAt(0)); // mostra qual codigo unicode do char
		
	}

}
