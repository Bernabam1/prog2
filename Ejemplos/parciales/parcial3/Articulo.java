package parcial3;

import java.util.ArrayList;

public abstract class Articulo implements Comparable<Articulo>{
	private String categoria;
	
	public Articulo(String categoria) {
		this.categoria = categoria;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public abstract ArrayList<String> getPalabrasClave();
	
	public abstract Articulo getCopia(Condicion cond);
	
	public abstract ArrayList<Articulo> buscar(Condicion cond);
	
	public int compareTo(Articulo art) {
		return art.getCategoria().compareTo(this.getCategoria());
	}
}
