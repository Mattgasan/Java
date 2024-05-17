package com.aula5;

public class Bateria {

	private int pontos;
	//final faz o atributo nunca mudar (constante)
	//nao usar camel case em constantes
	private final int CARGA_MAXIMA = 10;
	private final int CARGA_MINIMA = 0;

	public Bateria() {
		pontos = CARGA_MAXIMA;
	}
	public int get pontos
	
	public void recarregar() {
		if(pontos < CARGA_MAXIMA)
			pontos++;
	}
	
	//Isso é errado, nunca nunca faca isso
	//public boolean isVazio() {
	//	if(pontos == CARGA_MINIMA0 {
	//		return true;
	//	}else {
	//		return false;

	public boolean isVazio() {
		return pontos == CARGA_MINIMA;
	}
	
	public void gastar() {
		//nao vazio
		if(pontos > CARGA_MINIMA) {
			pontos--;
		}
	}
		
}
