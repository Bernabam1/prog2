package parcial3;

import java.util.ArrayList;

public class Suscriptor {
	private String nombre;
	private String apellido;
	private String mail;
	private ArrayList<Noticia> noticiasRecibidas;
	
	public Suscriptor(String nombre, String apellido, String mail) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.noticiasRecibidas = new ArrayList<>();
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public void recibirNoticia(Noticia noti, Condicion cond) {
		if (cond.cumple(noti)) {
			noticiasRecibidas.add(noti);
		}
	}
	
}
