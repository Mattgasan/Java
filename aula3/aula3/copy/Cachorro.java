package com.aula3.copy;

public class Cachorro {
	String nome, raca;

	Cachorro(String nome, String raca){
		this.nome = nome;
		this.raca = raca;
	}
	void latir() {
		System.out.println(nome + ": AUAU");
	}

	void mostrarRaca() {
		System.out.println(raca);
	}
}
