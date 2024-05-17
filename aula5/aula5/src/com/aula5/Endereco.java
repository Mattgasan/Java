package com.aula5;

public class Endereco {

	private String logradouro, cep, cidade;
	private Estado estado;

	public Endereco(String logradouro, String cep, String cidade, Estado estado) {
		this.logradouro = logradouro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}

	// Métodos void devem realizar ações computacionais
	// Mostrar na tela, modificiar estado,
	// conectar ao banco, fazer alguma operação sql
	// e etc...
	// Em metodos que nao sejam void, nao usar
	// Syso, ou outra ação computacional
	public void mostrarInfo() {
		System.out.println("Logradouro: " + logradouro);
		System.out.println("CEP: " + cep);
		System.out.println("Cidade: " + cidade);
		System.out.println("Estado: " + estado);
	}
}
