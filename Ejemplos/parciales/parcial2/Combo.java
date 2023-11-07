package parcial2;

import java.util.ArrayList;

public class Combo extends Articulo {
	private ArrayList<Articulo> elementos;
	private double descuentoPorProducto;
	private double descuentoMAX;

	public Combo(String nombre, double descuentoPorProducto, double descuentoMAX) {
		super(nombre);
		this.elementos = new ArrayList<>();
		this.descuentoPorProducto = descuentoPorProducto;
		this.descuentoMAX = descuentoMAX;
	}

	public double getDescuentoPorProducto() {
		return descuentoPorProducto;
	}

	public void setDescuentoPorProducto(double descuentoPorProducto) {
		this.descuentoPorProducto = descuentoPorProducto;
	}

	public double getDescuentoMAX() {
		return descuentoMAX;
	}

	public void setDescuentoMAX(double descuentoMAX) {
		this.descuentoMAX = descuentoMAX;
	}

	public void addElemento(Articulo elemento, Condicion cond) {
		if (cond.cumple(elemento)) {
			elementos.add(elemento);
		}
	}

	public ArrayList<Articulo> getElementos() {
		return new ArrayList<Articulo>(elementos);
	}

	@Override
	public double getPeso() {
		double pesoTotal = 0.0;
		for (Articulo elem : elementos) {
			pesoTotal += elem.getPeso();
		}
		return pesoTotal;
	}

	@Override
	public double getPrecio() {
		double precioTotal = 0.0;
		for (Articulo elem : elementos) {
			precioTotal += elem.getPrecio();
		}
		if (precioTotal - (descuentoPorProducto * elementos.size()) >= precioTotal * descuentoMAX) {
			return precioTotal * descuentoMAX;
		} else {
			return precioTotal - (descuentoMAX * elementos.size());
		}
	}

	@Override
	public ArrayList<String> getCategorias() {
		ArrayList<String> resultado = new ArrayList<>();
		for (Articulo elem : elementos) { // Recorro para obtener todos los ArrayList de String q tienen
			ArrayList<String> aux = elem.getCategorias(); // Recorro los ArrayList de String pidiendole especifico a c/u
			for (String categoria : aux) {
				if (!resultado.contains(categoria)) {
					resultado.add(categoria);
				}
			}
		}
		return resultado;
	}

	@Override
	public ArrayList<Articulo> buscar(Condicion cond) {
		ArrayList<Articulo> resultado = new ArrayList<>();
		for (Articulo elem : elementos) {
			if (cond.cumple(elem)) {
				resultado.addAll(elem.buscar(cond));
			}
		}
		return resultado;
	}

	@Override
	public int getCantElementos() {
		int cantidadTotal = super.getCantElementos();
		for (Articulo elem : elementos) {
			cantidadTotal += elem.getCantElementos();
		}
		return cantidadTotal;
	}

	public Producto getProductoMenorPeso() {
		Producto menorPeso = new Producto(getNombre(), Double.MAX_VALUE, 0.0);
		for (Articulo elem : elementos) {
			if (elem.getPeso() < menorPeso.getPeso()) {
				menorPeso = (Producto) elem; // Como soluciono esto?
			}
		}
		return menorPeso;
	}

	public Combo getCopia(Condicion cond) {
		Combo copia = new Combo(this.getNombre(), this.getDescuentoPorProducto(), this.getDescuentoMAX());
		for (Articulo elem : elementos) {
			copia.addElemento(elem, cond); // Cuando instancio la copia ya se inicia con un arrayList que puedo ir llenando
		}
		return copia;
	}

}
