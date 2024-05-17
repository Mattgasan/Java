package com.aula9;

public class Retangulo extends Quadrilatero {

	private double lado2;
	
	public Retangulo(double lado, double lado2) {
		super(lado);
		this.lado2 = lado2;
	}
	
	@Override
	public double calcularArea() {
		return getLado() *lado2;
	}
	
	@Override
	public double calcularPerim() {
		return 2*(getLado()+lado2);
	}
}
