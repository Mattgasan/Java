package com.aula9;

public class Gato extends Animal {

	public Gato(String nome) {
		super(nome);
	}

	@Override
	public void emitirSom() {
		System.out.println("MIAU MIAU");
	}
}
