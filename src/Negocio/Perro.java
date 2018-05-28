package Negocio;

import java.util.Date;

public class Perro {
	private String nombre;
	private String sexo;
	private int edad;
	private String raza;
	private String tamanio;
	private boolean usaBozal;
	private Date fechaUltimaAntirrabica;
	private String observaciones;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	public boolean isUsaBozal() {
		return usaBozal;
	}
	public void setUsaBozal(boolean usaBozal) {
		this.usaBozal = usaBozal;
	}
	public Date getFechaUltimaAntirrabica() {
		return fechaUltimaAntirrabica;
	}
	public void setFechaUltimaAntirrabica(Date fechaUltimaAntirrabica) {
		this.fechaUltimaAntirrabica = fechaUltimaAntirrabica;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
}
