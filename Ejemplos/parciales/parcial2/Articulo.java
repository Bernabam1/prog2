package parcial2;

import java.util.ArrayList;

public abstract class Articulo {
	private String nombre;

	public Articulo(String nombre) {
		this.setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract double getPeso();

	public abstract double getPrecio();

	public abstract ArrayList<String> getCategorias();

	public abstract ArrayList<Articulo> buscar(Condicion cond);

	public int getCantElementos() {
		return 1;
	}
	
	//public abstract Articulo getCopia();

}
