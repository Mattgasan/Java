package com.aula3.copy;

public class Agenda {
	int diaNumero;
	DiaDaSemana dia;

	Agenda(int diaNumero, DiaDaSemana dia) {
		this.diaNumero = diaNumero;
		this.dia = dia;
	}

	void mostrarTarefa() {
		System.out.println("Dia: " + diaNumero);
		switch(dia) {
		case DOMINGO: System.out.println("PEIXAO");
					break;
		case SEGUNDA: System.out.println("JAVA");
					break;
		case QUARTA: System.out.println("BD");
					break;
		case SEXTA: System.out.println("Maldade");
					break;
		case SABADO: System.out.println("SINUCA");
					break;
			default: System.out.println("F-SE");
			}
	}
}
