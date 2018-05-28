package Negocio;

import java.util.Date;

public abstract class Factura {
	private int idFactura;
	private Date fechaFactura;
	private Date fechaPago;
	private Reserva reserva;
	private String estado;
}
