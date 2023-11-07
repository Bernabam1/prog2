package parcial3;

import java.util.ArrayList;

public class Noticia extends Articulo {
	private String titulo;
	private String contenido;
	private String autor;
	private ArrayList<String> palabrasClave;

	public Noticia(String titulo, String contenido, String autor, String categoria) {
		super(categoria);
		this.titulo = titulo;
		this.contenido = contenido;
		this.autor = autor;
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

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setPalabrasClave(ArrayList<String> palabrasClave) {
		this.palabrasClave = palabrasClave;
	}

	@Override
	public ArrayList<String> getPalabrasClave() {
		return new ArrayList<String>(palabrasClave);
	}

	public void addPalabraClave(String palabra) {
		palabrasClave.add(palabra);
	}

	public Noticia getCopia() {
		Noticia copia = new Noticia(this.getTitulo(), this.getContenido(), this.getAutor(), this.getCategoria());
		return copia;
	}

	@Override
	public Articulo getCopia(Condicion cond) { // Necesito los dos, el get copia q devuelve una noticia
		if (cond.cumple(this)) { // Y este get copia para chequear la condicion y llamar al otro
			return this.getCopia();
		}
		return null; // Si no se cumple hace este return
	}

	@Override
	public ArrayList<Articulo> buscar(Condicion cond) {
		ArrayList<Articulo> resultado = new ArrayList<>();
		if(cond.cumple(this)) {
			resultado.add(this.getCopia());
		}
		return resultado;
	}
	
	

}
