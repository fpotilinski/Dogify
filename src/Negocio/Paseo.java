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
			String estado, ArrayList<Reserva> reservas, String horaInicio, String horaFin,
			String ubicacionActual, ArrayList<String> fotos) {
		this.idPaseo = idPaseo;
		this.fecha = fecha;
		this.hora = hora;
		this.duracion = duracion;
		this.capacidad = capacidad;
		this.tarifa = tarifa;
		this.estado = estado;
		this.reservas = reservas;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.ubicacionActual = ubicacionActual;
		this.fotos = fotos;
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
