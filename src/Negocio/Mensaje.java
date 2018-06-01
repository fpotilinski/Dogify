package Negocio;

import java.util.Date;

public class Mensaje {
	private Date fecha;
	private String hora;
	private String mensaje;
	
	public Mensaje(Date fecha, String hora, String mensaje) {
		this.fecha = fecha;
		this.hora = hora;
		this.mensaje = mensaje;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
