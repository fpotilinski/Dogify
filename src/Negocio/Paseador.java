package Negocio;

import java.util.ArrayList;
import java.util.Date;

public class Paseador extends Usuario{
	private String nroRegistroAPRA;
	private ArrayList<Paseo> paseos;
	private ArrayList<Calificacion> calificaciones;
	
	public Paseador(String email, String password, String nombre, String apellido, String sexo,
			Date fechaNacimiento, String tipoDocumento, String nroDocumento,
			ArrayList<Direccion> direcciones, ArrayList<Conversacion> conversaciones, 
			String nroRegistroAPRA, ArrayList<Paseo> paseos, ArrayList<Calificacion> calificaciones) {
		
		super(email, password, nombre, apellido, sexo, fechaNacimiento, tipoDocumento, nroDocumento,
				direcciones, conversaciones);
		this.nroRegistroAPRA = nroRegistroAPRA;
		this.paseos = paseos;
		this.calificaciones = calificaciones;
	}

	public String getNroRegistroAPRA() {
		return nroRegistroAPRA;
	}

	public void setNroRegistroAPRA(String nroRegistroAPRA) {
		this.nroRegistroAPRA = nroRegistroAPRA;
	}

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

