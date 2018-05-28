package Negocio;

import java.util.ArrayList;

public class Paseador extends Usuario{
	private ArrayList<Paseo> paseos;
	private ArrayList<Calificacion> calificaciones;
	
	public ArrayList<Paseo> getPaseos() {
		return paseos;
	}
	public void setPaseos(ArrayList<Paseo> paseos) {
		this.paseos = paseos;
	}
	public ArrayList<Calificacion> getCalificaciones() {
		return calificaciones;
	}
	public void setCalificaciones(ArrayList<Calificacion> calificaciones) {
		this.calificaciones = calificaciones;
	}
	
	
	
}
