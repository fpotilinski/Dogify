package Negocio;

public class Reserva {
	private int idReserva;
	private Perro perro;
	private String estado;
	private Direccion direccion;
	private String horaRetiro;
	private String horaDevolucion;
	
	public Reserva(int idReserva, Perro perro, Direccion direccion, String estado, String horaRetiro,
			String horaDevolucion) {
		this.idReserva = idReserva;
		this.perro = perro;
		this.estado = estado;
		this.direccion = direccion;
		this.horaRetiro = horaRetiro;
		this.horaDevolucion = horaDevolucion;
	}
	
	// Actualizar estado a CANCELADA o INICIADA o FACTURADA
	public void actualizarEstado(String estado) {
		this.estado = estado;
	}
	
	// Actualizar estado a RETIRADO o DEVUELTO
	public void actualizarEstado(String estado, String hora){
		this.estado = estado;
		if (estado.equals("RETIRADO")) {
			this.horaRetiro = hora;
		}else {
			this.horaDevolucion = hora;
		}
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
	
}
