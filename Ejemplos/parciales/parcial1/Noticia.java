package parcial1;

import java.util.ArrayList;

public class Noticia extends Articulo {
	private String titulo;
	private String contenido;
	private String autor;
	private String categoria;
	private ArrayList<String> palabrasClave;
	
	public Noticia(String titulo, String contenido, String autor, String categoria) {
		this.titulo = titulo;
		this.contenido = contenido;
		this.autor = autor;
		this.categoria = categoria;
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
	
	@Override
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public void addPalabraClave(String palabra) {
		palabrasClave.add(palabra);
	}
	
	@Override
	public ArrayList<String> getPalabrasClave(){
		return new ArrayList<String>(palabrasClave);
	}
	
	@Override
	public ArrayList<Articulo> buscar(Condicion cond){
		ArrayList<Articulo> resultado = new ArrayList<>();
		if(cond.cumple(this)) {
			resultado.add(this);
		}
		return resultado;
	}
	
	public void completarPalabrasClave(Noticia unaNoticia, Condicion unaCondicion, ArrayList<String> palabras) { // Le paso un ArrayList de palabras
		if(unaCondicion.cumple(unaNoticia)) {
			for (String palabra : palabras) { // Despues le agrego las que sean
				unaNoticia.addPalabraClave(palabra);
			}	
		}
	}
}
