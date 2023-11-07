package parcial4;

import java.util.ArrayList;

public class Noticia extends Articulo {
	private String contenido;
	private String categoria;
	private ArrayList<String> palabrasClave;
	
	public Noticia(String titulo, String editor) {
		super(titulo, editor);
		this.palabrasClave = new ArrayList<>();
		}
	
	@Override
	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String getCategoria() {
		return categoria;
	}
	
	public void addPalabraClave(String palabra) {
		if (!palabrasClave.contains(palabra)) {
		palabrasClave.add(palabra);
		}
	}

	@Override
	public ArrayList<String> getPalabrasClave() {
		return new ArrayList<String>(palabrasClave);
	}

	@Override
	public int getCantElementos() {
		return 1;
	}

	@Override
	public ArrayList<Articulo> buscar(Condicion cond) {
		ArrayList<Articulo> resultado = new ArrayList<>();
		if (cond.cumple(this)) {
			resultado.add(this);
		}
		return resultado;
	}
	
}
