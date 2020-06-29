package com.sophos.Capacitacion.Nivel1Calse2;

public class Edad {

	int edad;

	public Edad() {
		super();
		edad = 0;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad < 18) {
			System.out.println("La persona es Menor de edad");
		}
		else {
			System.out.println("La persona es Mayor de edad");
		}
		this.edad = edad;
	}
	
	
}
