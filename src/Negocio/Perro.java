package Negocio;

import java.util.Date;

public class Perro {
	private String nombre;
	private String raza;
	private String tamanio;
	private String sexo;
	private int edad;
	private boolean usaBozal;
	private Date fechaUltimaAntirrabica;
	private String observaciones;
	
	public Perro(String nombre, String raza, String tamanio, String sexo, int edad, boolean usaBozal,
			Date fechaUltimaAntirrabica, String observaciones) {
		this.nombre = nombre;
		this.raza = raza;
		this.tamanio = tamanio;
		this.sexo = sexo;
		this.edad = edad;
		this.usaBozal = usaBozal;
		this.fechaUltimaAntirrabica = fechaUltimaAntirrabica;
		this.observaciones = observaciones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
