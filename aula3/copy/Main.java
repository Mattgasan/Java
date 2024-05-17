package com.aula3.copy;

public class Main {

	public static void main(String[] arqs) {
		Cachorro c = new Cachorro("BIDU", "SRD");
		c.latir();
		c.mostrarRaca();
		
		Cachorro k = new Cachorro("DOG","POODLE");
		k.latir();
		k.mostrarRaca();
		
		Calculadora a = new Calculadora(10, 0);
		a.somar();
		a.subtrair();
		a.multiplicar();
		a.dividir();
		
		Agenda z = new Agenda(4,DiaDaSemana.SEGUNDA);
		z.mostrarTarefa();
		
		produto p = new Produto("Haskell: Programação",Tipo)
	}
}