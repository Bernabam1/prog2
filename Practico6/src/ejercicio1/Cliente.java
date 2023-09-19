package ejercicio1;

import java.time.LocalDate;
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

	public void alquilarAuto(Auto unAuto, LocalDate unaFecha) {
		if (!autosAlquilados.contains(unAuto) && unAuto.isDisponible()) {
			autosAlquilados.add(unAuto);
			unAuto.setDisponible(false);
			unAuto.setFechaAlquiler(unaFecha);
		} else {System.out.println("Auto no disponible");}
	}
	
	public void alquilarPelicula(Pelicula unaPeli, LocalDate unaFecha) {
		if (!peliculasAlquiladas.contains(unaPeli) && unaPeli.isDisponible()) {
			peliculasAlquiladas.add(unaPeli);
			unaPeli.setCantCopias(unaPeli.getCantCopias()-1);
			unaPeli.setFechaAlquiler(unaFecha);
		} else {System.out.println("Pelicula no disponible");}
	}
	
	public String toString() {
		return nombre;
	}
}
