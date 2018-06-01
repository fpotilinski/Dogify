package Negocio;

public class Direccion {
	private String calle;
	private int nro;
	private int piso;
	private String depto;
	private String ciudad;
	private String barrio;
	private String coordenadas;
	
	public Direccion(String calle, int nro, int piso, String depto, String ciudad, String barrio, String coordenadas) {
		this.calle = calle;
		this.nro = nro;
		this.piso = piso;
		this.depto = depto;
		this.ciudad = ciudad;
		this.barrio = barrio;
		this.coordenadas = coordenadas;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNro() {
		return nro;
	}

	public void setNro(int nro) {
		this.nro = nro;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public String getDepto() {
		return depto;
	}

	public void setDepto(String depto) {
		this.depto = depto;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	public String getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(String coordenadas) {
		this.coordenadas = coordenadas;
	}
}
