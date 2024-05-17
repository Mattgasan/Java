package com.aula9;

public class Quadrado extends Quadrilatero {

	public Quadrado(double lado) {
		super(lado);
	}
	
	@Override
	public double calcularArea() {
		//lado * lado
		return getLado()*getLado();
	}

}
