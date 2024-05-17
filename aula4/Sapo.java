package com.aula4;

public class Sapo {

	private int qntPulo;
	private static int qntSapo;
	
	public Sapo() {
	qntPulo++;
	}
	public void pular() {
		qntPulo++;
	}
	public int getQntPulo() {
		return qntPulo;
	}
	public static int getQntSapo() {
		return qntSapo;
	}
}
