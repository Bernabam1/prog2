package ejercicio1;

import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private ArrayList<Pelicula> peliculasAlquiladas;
	private ArrayList<Auto> autosAlquilados;

	public Cliente(String nombre) {
		this.nombre = nombre;
		this.peliculasAlquiladas = new ArrayList<>();
		this.autosAlquilados = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void alquilarAuto(Auto unAuto) {
		if (!autosAlquilados.contains(unAuto) && unAuto.isDisponible()) {
			autosAlquilados.add(unAuto);
			unAuto.setDisponible(false);
		}
	}
	
	public void alquilarPelicula(Pelicula unaPeli) {
		if (!peliculasAlquiladas.contains(unaPeli) && unaPeli.isDisponible()) {
			peliculasAlquiladas.add(unaPeli);
		}
	}
}