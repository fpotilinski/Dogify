package Negocio;

import java.util.ArrayList;
import java.util.Date;

public class Cliente extends Usuario{
	private Direccion direccionFacturacion;
	private ArrayList<Perro> perros;
	private float cuentaCorriente;
	
	public Cliente(String email, String password, String nombre, String apellido, String sexo,
			Date fechaNacimiento, String tipoDocumento, String nroDocumento,
			ArrayList<Direccion> direcciones, ArrayList<Conversacion> conversaciones,
			Direccion direccionFacturacion, ArrayList<Perro> perros, float cuentaCorriente) {
		super(email, password, nombre, apellido, sexo, fechaNacimiento, tipoDocumento, nroDocumento,
				direcciones, conversaciones);
		this.direccionFacturacion = direccionFacturacion;
		this.perros = perros;
		this.cuentaCorriente = cuentaCorriente;
	}

	public Direccion getDireccionFacturacion() {
		return direccionFacturacion;
	}

	public void setDireccionFacturacion(Direccion direccionFacturacion) {
		this.direccionFacturacion = direccionFacturacion;
	}

	public ArrayList<Perro> getPerros() {
		return perros;
	}

	public void setPerros(ArrayList<Perro> perros) {
		this.perros = perros;
	}

	public float getCuentaCorriente() {
		return cuentaCorriente;
	}

	public void setCuentaCorriente(float cuentaCorriente) {
		this.cuentaCorriente = cuentaCorriente;
	}
}


