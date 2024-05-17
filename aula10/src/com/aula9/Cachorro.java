package com.aula9;

public class Cachorro extends Animal {

	public Cachorro(String nome) {
		super(nome); //super chama o construtor da classe de cima
	}
	
	@Override
	public void emitirSom() {
		System.out.println("AU AU");
	}

}
