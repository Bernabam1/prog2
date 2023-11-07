package parcial2;

import java.util.ArrayList;

public class Producto extends Articulo {
	private double peso;
	private double precio;
	private ArrayList<String> categorias;

	public Producto(String nombre, double peso, double precio) {
		super(nombre);
		this.setPeso(peso);
		this.setPrecio(precio);
		this.categorias = new ArrayList<>();
	}

	@Override
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void addCategoria(String categoria) {
		if (!categorias.contains(categoria)) {
			categorias.add(categoria);
		}
	}

	@Override
	public ArrayList<String> getCategorias() {
		return new ArrayList<String>(categorias);
	}

	@Override
	public ArrayList<Articulo> buscar(Condicion cond) {
		ArrayList<Articulo> aux = new ArrayList<>();
		if(cond.cumple(this)) {
			aux.add(this);
		}
		return aux;
	}

	@Override
	public int getCantElementos() {
		return 1;
	}
	
	public Producto getCopia(Condicion cond) {
		if (cond.cumple(this)) {
        Producto copia = new Producto(this.getNombre(),this.getPeso(),this.getPrecio());
        return copia;
		} else {
			return null; // ??? que retorno si no cumple?
		}
    }

}
