package com.aula5;

public class Aluno {

	private String nome, ra;
	//Aqui puxamos tudo oq eh acessível
	//da classe Endereco.
	private Endereco endereco;
	
	public Aluno(String nome
				 ,String ra
				 ,Endereco endereco) {
		this.nome = nome;
		this.ra = ra;
		this.endereco = endereco;
	}
	
	public void mostrarInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("RA: " + ra);
		//Tudo que já foi programado, não precisa
		//ser repetido
		endereco.mostrarInfo();
	}
}
