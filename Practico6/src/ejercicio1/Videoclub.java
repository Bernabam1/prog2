package ejercicio1;

import java.util.ArrayList;

public class Videoclub {
	private ArrayList<Cliente> clientes;
	private ArrayList<Pelicula> peliculas;
	private ArrayList<Auto> autos;

	public Videoclub() {
		this.clientes = new ArrayList<>();
		this.peliculas = new ArrayList<>();
		this.autos = new ArrayList<>();
	}

	public void addCliente(Cliente unCliente) {
		if (!clientes.contains(unCliente)) {
			clientes.add(unCliente);
		}
	}

	public ArrayList<Cliente> getClientes() {
		return new ArrayList<Cliente>(clientes);
	}

	public void addPelicula(Pelicula unaPelicula) {
		if (!peliculas.contains(unaPelicula)) {
			peliculas.add(unaPelicula);
		}
	}

	public ArrayList<Pelicula> getPeliculas() {
		return new ArrayList<Pelicula>(peliculas);
	}

	public void addAuto(Auto unAuto) {
		if (!autos.contains(unAuto)) {
			autos.add(unAuto);
		}
	}

	public ArrayList<Auto> getAutos() {
		return new ArrayList<Auto>(autos);
	}

	public ArrayList<Auto> getAutosDisponibles() {
		ArrayList<Auto> aux = new ArrayList<>();
		for (Auto auto : autos) {
			if (!auto.isDisponible()) {
				aux.add(auto);
			}
		}
		return aux;
	}

	public ArrayList<Pelicula> getPeliculasDisponibles() {
		ArrayList<Pelicula> aux = new ArrayList<>();
		for (Pelicula pelicula : peliculas) {
			if (pelicula.isDisponible()) {
				aux.add(pelicula);
			}
		}
		return aux;
	}

}
