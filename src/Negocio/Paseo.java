package Negocio;

import java.util.ArrayList;
import java.util.Date;

public class Paseo {
	private int idPaseo;
	private Date fecha;
	private String hora;
	private int capacidad;
	private long horaInicio;
	private long horaFin;
	private String estado;
	private ArrayList<String> fotos;
	private float tarifa;
	private float prueba;
	private String ubicacionActual;
	private ArrayList<Reserva> reservas;
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
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
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
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public ArrayList<String> getFotos() {
		return fotos;
	}
	public void setFotos(ArrayList<String> fotos) {
		this.fotos = fotos;
	}
	public float getTarifa() {
		return tarifa;
	}
	public void setTarifa(float tarifa) {
		this.tarifa = tarifa;
	}
	public String getUbicacionActual() {
		return ubicacionActual;
	}
	public void setUbicacionActual(String ubicacionActual) {
		this.ubicacionActual = ubicacionActual;
	}
	public ArrayList<Reserva> getReservas() {
		return reservas;
	}
	public void setReservas(ArrayList<Reserva> reservas) {
		this.reservas = reservas;
	}
	
	public void iniciarPaseo() {
		this.estado = "INICIADO";
		Date horaActual = new Date();
		this.horaInicio = horaActual.getTime();
		for(Reserva reserva : reservas) {
			reserva.se
		}
	}
	
	public void finalizarPaseo() {
		for(Reserva reserva : reservas) {
			if (reserva.getEstado().equals("DEVUELTO")){
				
			}else {
			//lanzar exception
			}
		}
		this.estado = "FINALIZADO";
		Date horaActual = new Date();
		this.horaFin = horaActual.getTime();
	}
	
	
}
