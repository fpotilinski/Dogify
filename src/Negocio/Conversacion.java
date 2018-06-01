package Negocio;

import java.util.ArrayList;
import java.util.Date;

public class Conversacion {
	private Usuario usuario1;
	private Usuario usuario2;
	private ArrayList<Mensaje> mensajes;
	
	public Conversacion(Usuario usuario1, Usuario usuario2) {
		this.usuario1 = usuario1;
		this.usuario2 = usuario2;
		this.mensajes = new ArrayList<Mensaje>();
	}
	
	public void nuevoMensaje(Date fecha, String hora, String mensaje) {
		Mensaje nuevoMensaje = new Mensaje(fecha, hora, mensaje);
		mensajes.add(nuevoMensaje);
	}
	
	public Usuario getUsuario1() {
		return usuario1;
	}
	public void setUsuario1(Usuario usuario1) {
		this.usuario1 = usuario1;
	}
	public Usuario getUsuario2() {
		return usuario2;
	}
	public void setUsuario2(Usuario usuario2) {
		this.usuario2 = usuario2;
	}
	public ArrayList<Mensaje> getMensajes() {
		return mensajes;
	}
	public void setMensajes(ArrayList<Mensaje> mensajes) {
		this.mensajes = mensajes;
	}
}
