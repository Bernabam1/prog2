package ejercicio2;

import java.util.ArrayList;

/*Un documento tiene un título, una lista de autores, un contenido textual y una lista de
palabras clave.*/

public class Documento {
	private String titulo;
	private String contenido;
	private ArrayList<String> autores;
	private ArrayList<String> palabrasClave;

	public Documento(String titulo, String contenido) {
		this.titulo = titulo;
		this.contenido = contenido;
		this.autores = new ArrayList<>();
		this.palabrasClave = new ArrayList<>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public ArrayList<String> getAutores() {
		return new ArrayList<>(autores);
	}

	public void addAutores(String autor) {
		if (!autores.contains(autor)) {
			autores.add(autor);
		}
	}

	public ArrayList<String> getPalabrasClave() {
		return new ArrayList<>(palabrasClave);
	}

	public void addPalabrasclave(String palabra) {
		if (!palabrasClave.contains(palabra)) {
			palabrasClave.add(palabra);
		}
	}
	
	public String toString() {
		return titulo;
	}
}
