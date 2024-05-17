package com.aula8;

public class Teste {

	public static void main(String[] args) {
		Cachorro c = new Cachorro("REX");
		c.latir();
		c.respirar(); //Cachorro acessa respirar por herança
		Gato g = new Gato("Juvenal");
		g.miar();
		g.respirar(); //Gato acessa respirar por herança
		Animal a = new Animal("GENERICO");
		a.respirar();
		a.mostrar();
		c.comer();
		g.comer();
		a.comer();
	}
}
