package Negocio;

import java.util.ArrayList;

public class Cliente extends Usuario{
	private ArrayList<Perro> perros;
	private float cuentaCorriente;
	
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


