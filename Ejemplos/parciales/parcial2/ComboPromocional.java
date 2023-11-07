package parcial2;

import java.util.ArrayList;

public class ComboPromocional extends Combo {
	private ArrayList<Articulo> elementos;

	public ComboPromocional(String nombre, double descuentoPorProducto, double descuentoMAX) {
		super(nombre, descuentoPorProducto, descuentoMAX);
		this.elementos = new ArrayList<>();
	}
	
	@Override
	public double getPrecio() {
		double precio = 0.0;
		for(Articulo elem : elementos) {
			precio += elem.getPrecio();
		}
		return precio/elementos.size();
	}
	
}