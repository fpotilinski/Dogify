package Negocio;

import java.util.ArrayList;

public class Reserva {
	private String estado;
	private Perro perro;
	private ArrayList<Mensaje> mensajes;
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Perro getPerro() {
		return perro;
	}
	public void setPerro(Perro perro) {
		this.perro = perro;
	}
	public ArrayList<Mensaje> getMensajes() {
		return mensajes;
	}
	public void setMensajes(ArrayList<Mensaje> mensajes) {
		this.mensajes = mensajes;
	}
	
}
