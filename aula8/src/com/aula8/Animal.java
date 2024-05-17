package com.aula8;

public class Animal {

	private String nome;
	
	public Animal (String nome) {
		this.nome = nome;
	}
	
	public void respirar() {
		System.out.println("sigh");
	}
	
	public void mostrar() {
		System.out.println(nome);
	}

	protected String getNome() {
		System.out.println();
		return nome;
	}
	
	public void comer() {
		System.out.println("Comeu");
	}
}
