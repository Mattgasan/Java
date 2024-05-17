package com.aula9;

public class Quadrilatero {

	private double lado; //Como ele é classe pai, não pode deixar public
	
	public Quadrilatero(double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}
	
	//N SEI SE EH QUADRADO OU RETANGULO
	public double calcularArea() {
		return 0;
	}
	
	public double calcularPerim() {
		return 0;
	}
//	this.$lado = 7; 
//	public void calcularArea() {
//		Object area = [lado * lado];
//	}
//	
//	public void calcularPerimetro() {
//		
//	}
}
