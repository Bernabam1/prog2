package ejercicio1_v2;

import java.util.ArrayList;

public class Videoclub {
	private ArrayList<Cliente> clientes;
	private ArrayList<Producto> productos;

	public Videoclub() {
		this.clientes = new ArrayList<>();
		this.productos = new ArrayList<>();
	}

	public void addCliente(Cliente unCliente) {
		if (!clientes.contains(unCliente)) {
			clientes.add(unCliente);
		}
	}

	public ArrayList<Cliente> getClientes() {
		return new ArrayList<Cliente>(clientes);
	}

	public void addProducto(Producto unProducto) {
		if (!productos.contains(unProducto)) {
			productos.add(unProducto);
		}
	}

	public ArrayList<Producto> getProductos() {
		return new ArrayList<Producto>(productos);
	}

	public ArrayList<Producto> getProductosDisponibles() {
		ArrayList<Producto> aux = new ArrayList<>();
		for (Producto producto : productos) {
			if (producto.isDisponible()) {
				aux.add(producto);
			}
		}
		return aux;
	}
	
	public ArrayList<Producto> getProductosAlquilados() {
		ArrayList<Producto> aux = new ArrayList<>();
		for (Producto producto : productos) {
			if (!producto.isDisponible()) {
				aux.add(producto);
			}
		}
		return aux;
	}
	
	/* Como comparo si pasaron n días entre las dos fechas?
	 * 
	 * public void getAlquileresVencidos() {
		for(Producto producto : productos) {
			if(producto.getFechaAlquiler())
		}
	}*/
	
}
