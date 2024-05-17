package com.aula4;

public class Aluno {
	private String nome;
	private String ra;
	private Cursos curso;
	
	public Aluno(String nome, String ra, Cursos curso) {
		super();
		this.nome = nome;
		this.ra = ra;
		this.curso = curso;
	}
	
	public String getNome() {
		//nome eh acessivel apenas na classe Aluno
		return nome;
	}
	public String getRA() {
		return ra;
	}
	public Cursos getCursos() {
		return curso;
	}
}
