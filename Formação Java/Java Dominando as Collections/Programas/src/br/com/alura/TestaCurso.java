package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {

		
Curso javaColecoes = new Curso("Dominando as colecoes do java", "Luan Reinheimer");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com LinkedList", 22));
		
		System.out.println(javaColecoes.getAulas());
		
	}

}
