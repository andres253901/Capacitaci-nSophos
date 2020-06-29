package com.sophos.Capacitacion.Clase4;

public class Vehiculo {

	private int CantidadLlantas ;
	private String TipoEnergia ;
	
	public Vehiculo() {
		super();
		this.CantidadLlantas = 0;
		this.TipoEnergia = null;
	}

	public int getCantidadLlantas() {
		return CantidadLlantas;
	}

	public void setCantidadLlantas(int cantidadLlantas) {
		this.CantidadLlantas = cantidadLlantas;
	}

	public String getTipoEnergia() {
		return TipoEnergia;
	}

	public void setTipoEnergia(String tipoEnergia) {
		this.TipoEnergia = tipoEnergia;
	}
	
	
}
