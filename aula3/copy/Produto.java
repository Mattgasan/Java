package com.aula3.copy;

public class Produto {
	String nome;
	Tipo tipo;
	double preco;
	
	Produto(String nome,Tipo tipo, double preco) {
		
	}
	void mostrarInfo() {
		System.out.println(nome);
		System.out.println(preco);
		System.out.println(tipo);

		}
	}
	void calcularDesconto() {
		switch(tipo) {
		case LIVRO: System.out.println(preco - (15 / 100) );
	}
	
	
}
