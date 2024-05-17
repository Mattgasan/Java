package com.aula9;

public class Main {

	public static void main (String[] args) {
//		Foo f = new Foo(5);
//		Foo g = new Foo("Oi");
//		Foo h = new Foo(5,false);
//		Foo i = new Foo(true,3);
//		Nome n = new Nome("Matheus");
//		Email e = new Email("matheus@fatec.br");
//		if(Validador.validar(e)) {
//			System.out.println("Email válido");
//		}else {
//			System.out.println("Email n válido");
//		}
//		if(Validador.validar(n)) {
//			System.out.println("Nome valido");
//		}else {
//			System.out.println("Nome n valido");
//		}
		Cachorro c = new Cachorro("REX");
		c.emitirSom();
		
		Gato g = new Gato("Frajola");
		g.emitirSom();
		
		Animal a = new Animal("X");
		a.emitirSom();
	}
}
