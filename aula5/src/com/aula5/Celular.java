package com.aula5;

public class Celular {

	private String nome, numero;
	private Bateria bat;
	public Celular(String nome, String numero, Bateria bat) {
		this.nome = nome;
		this.numero = numero;
		this.bat = bat;
		}

	public void mostrar() {
		if(!bat.isVazio()) {
			System.out.println("Nome: " + nome);
			System.out.println("Numero: " + numero);
			bat.gastar();
		} 
	}
	
	public void recarregar () {
		System.out.println("Recarregando...");
		bat.recarregar();
	}}