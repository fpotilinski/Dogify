package Controladores;

import java.util.ArrayList;

import Negocio.Conversacion;
import Negocio.Usuario;

public class AdmMensajeria {
	private ArrayList<Conversacion> conversaciones;
	
	public void nuevaConversacion(Usuario usuario1, Usuario usuario2) {
		Conversacion conversacion = new Conversacion(usuario1, usuario2);
		usuario1.agregarConversacion(conversacion);
		usuario2.agregarConversacion(conversacion);
		conversaciones.add(conversacion);
	}

}
