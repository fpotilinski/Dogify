package Negocio;

import java.util.ArrayList;
import java.util.Date;

public class Usuario {
	private String email;
	private String password;
	private String nombre;
	private String apellido;
	private String tipoDocumento;
	private String nroDocumento;
	private Date fechaNacimiento;
	private Direccion direccionFacturacion;
	private ArrayList<Direccion> direcciones;
	private ArrayList<Conversacion> conversaciones;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNroDocumento() {
		return nroDocumento;
	}
	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Direccion getDireccionFacturacion() {
		return direccionFacturacion;
	}
	public void setDireccionFacturacion(Direccion direccionFacturacion) {
		this.direccionFacturacion = direccionFacturacion;
	}
	public ArrayList<Direccion> getDirecciones() {
		return direcciones;
	}
	public void setDirecciones(ArrayList<Direccion> direcciones) {
		this.direcciones = direcciones;
	}
	public ArrayList<Conversacion> getConversaciones() {
		return conversaciones;
	}
	public void setConversaciones(ArrayList<Conversacion> conversaciones) {
		this.conversaciones = conversaciones;
	}
}
