package Negocio;

import java.util.ArrayList;

public class Reserva {
	private int idReserva;
	private Perro perro;
	private String estado;
	private Direccion direccion;
	private String horaRetiro;
	private String horaDevolucion;
	private ArrayList<Mensaje> mensajes;
	
	public Reserva(int idReserva, Perro perro, String estado, Direccion direccion, String horaRetiro,
			String horaDevolucion, ArrayList<Mensaje> mensajes) {
		this.idReserva = idReserva;
		this.perro = perro;
		this.estado = estado;
		this.direccion = direccion;
		this.horaRetiro = horaRetiro;
		this.horaDevolucion = horaDevolucion;
		this.mensajes = mensajes;
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public Perro getPerro() {
		return perro;
	}

	public void setPerro(Perro perro) {
		this.perro = perro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public String getHoraRetiro() {
		return horaRetiro;
	}

	public void setHoraRetiro(String horaRetiro) {
		this.horaRetiro = horaRetiro;
	}

	public String getHoraDevolucion() {
		return horaDevolucion;
	}

	public void setHoraDevolucion(String horaDevolucion) {
		this.horaDevolucion = horaDevolucion;
	}

	public ArrayList<Mensaje> getMensajes() {
		return mensajes;
	}

	public void setMensajes(ArrayList<Mensaje> mensajes) {
		this.mensajes = mensajes;
	}
	
}
