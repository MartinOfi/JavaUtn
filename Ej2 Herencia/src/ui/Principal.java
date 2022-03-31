package ui;

import entidades.*;

public class Principal {

	public static void main(String[] args) {
		Persona p1 = new Persona(41605012, "Oficialdegui", "Martin");
		Persona p2 = new Persona();
//		System.out.println(p1.getDetalle(true));
//		System.out.println(p2.getDetalle(true));
		Alumno al = new Alumno();
		System.out.println(al.getDetalle(true));
		Persona a3 = new Alumno();
		
	}
}
