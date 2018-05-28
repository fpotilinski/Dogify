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
	private ArrayList<Direccion> direcciones;
	private ArrayList<Conversacion> conversaciones;
}
