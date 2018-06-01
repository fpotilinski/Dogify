package Negocio;

import java.util.ArrayList;
import java.util.Date;

public abstract class Usuario {
	private String email;
	private String password;
	private String nombre;
	private String apellido;
	private String sexo;
	private Date fechaNacimiento;
	private String tipoDocumento;
	private String nroDocumento;
	private ArrayList<Direccion> direcciones;
	private ArrayList<Conversacion> conversaciones;
	
	public Usuario(String email, String password, String nombre, String apellido, String sexo,
			Date fechaNacimiento, String tipoDocumento, String nroDocumento,
			ArrayList<Direccion> direcciones, ArrayList<Conversacion> conversaciones) {
		this.email = email;
		this.password = password;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
		this.tipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
		this.direcciones = new ArrayList<Direccion>();
		this.conversaciones = new ArrayList<Conversacion>();
	}
	
	public void agregarDireccion(String calle, int nro, int piso, String depto, String ciudad, String barrio,
			String coordenadas) {
		Direccion direccion = new Direccion(calle, nro, piso, depto, ciudad, barrio, coordenadas);
		direcciones.add(direccion);
	}
	
	public void agregarConversacion(Conversacion conversacion) {
		conversaciones.add(conversacion);
	}

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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
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
