package com.aula4;

public class Main {

	public static void main(String[] args){
		//Foo f = new Foo();
	//f.x = 3;
	//System.out.println(f.x);
	//f.x = 10;
	//System.out.println(f.z);
	
	Aluno a = new Aluno("Matheus",
						"00508322210011",
						Cursos.SI);
	
	System.out.println(a.getNome());
	System.out.println(a.getRA());
	System.out.println(a.getCursos());
	
	Sapo s = new Sapo();
	s.pular();
	Sapo t = new Sapo();
	t.pular();
	Sapo w = new Sapo();
	w.pular();
	System.out.println(s.getQntPulo());
	System.out.println(t.getQntPulo());
	System.out.println(w.getQntPulo());
	System.out.println(Sapo.getQntSapo());
	}
}