package Negocio;

public class Calificacion {
	private Reserva reserva;
	private int puntaje;
	private String comentario;
	
	public Calificacion(Reserva reserva, int puntaje, String comentario) {
		this.reserva = reserva;
		this.puntaje = puntaje;
		this.comentario = comentario;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
}
