package Negocio;

import java.util.ArrayList;
import java.util.Date;

public class Paseo {
	private int idPaseo;
	private Date fecha;
	private String hora;
	private int duracion;
	private int capacidad;
	private float tarifa;
	private String estado;
	private ArrayList<Reserva> reservas;
	private String horaInicio;
	private String horaFin;
	private String ubicacionActual;
	private ArrayList<String> fotos;
	
	public Paseo(int idPaseo, Date fecha, String hora, int duracion, int capacidad, float tarifa,
			String estado, String horaInicio, String horaFin,
			String ubicacionActual) {
		this.idPaseo = idPaseo;
		this.fecha = fecha;
		this.hora = hora;
		this.duracion = duracion;
		this.capacidad = capacidad;
		this.tarifa = tarifa;
		this.estado = estado;
		this.reservas = new ArrayList<Reserva>();
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.ubicacionActual = ubicacionActual;
		this.fotos = new ArrayList<String>();
	}
	
	public void altaReserva(int idReserva, Perro perro, Direccion direccion) {
		Reserva reserva = new Reserva(idReserva, perro, direccion, "PENDIENTE", null, null);
		reservas.add(reserva);
	}
	
	// Actualizar estado a CANCELADO
	public void actualizarEstado(String estado) {
		for(Reserva reserva : reservas) {
			reserva.actualizarEstado("CANCELADA");
		}
		this.estado = estado;
	}
	
	// Actualizar estado a INICIADO
	public void actualizarEstado(String estado, String horaInicio) {
		this.estado = estado;
		this.horaInicio = horaInicio;
	}
	
	public void agregarFoto(String foto) {
		fotos.add(foto);
	}

	public int getIdPaseo() {
		return idPaseo;
	}

	public void setIdPaseo(int idPaseo) {
		this.idPaseo = idPaseo;
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

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public float getTarifa() {
		return tarifa;
	}

	public void setTarifa(float tarifa) {
		this.tarifa = tarifa;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public ArrayList<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(ArrayList<Reserva> reservas) {
		this.reservas = reservas;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	public String getUbicacionActual() {
		return ubicacionActual;
	}

	public void setUbicacionActual(String ubicacionActual) {
		this.ubicacionActual = ubicacionActual;
	}

	public ArrayList<String> getFotos() {
		return fotos;
	}

	public void setFotos(ArrayList<String> fotos) {
		this.fotos = fotos;
	}
}
