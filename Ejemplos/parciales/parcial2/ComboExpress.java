package parcial2;

import java.util.ArrayList;

public class ComboExpress extends Combo {
	private ArrayList<Articulo> elementos;
	private String categoria;

	public ComboExpress(String nombre, double descuentoPorProducto, double descuentoMAX) {
		super(nombre, descuentoPorProducto, descuentoMAX);
		this.elementos = new ArrayList<>();
		this.categoria = "Herramientas";
	}

	public void addElemento(Articulo elemento) {
		if (elemento.getCategorias().contains(categoria)) {
			elementos.add(elemento);
		}
	}
}
