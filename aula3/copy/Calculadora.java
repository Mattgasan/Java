package com.aula3.copy;

public class Calculadora {
	double n1, n2;
	
	Calculadora(double n1, double n2){
		this.n1 = n1;
		this.n2 = n2;
	}
	
	void somar() {
		System.out.println(n1 + n2);
	}
	
	void subtrair() {
		System.out.println(n1 - n2);
	}
	
	void multiplicar() {
		System.out.println(n1 * n2);
	}
	
	void dividir() {
		
	if(n2 == 0 ) {
		System.out.println("Escolha um numero diferente de 0"); }
		else {
			System.out.println(n1 / n2); }
		}
	}
