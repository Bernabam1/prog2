package parcial_2023;

import java.util.ArrayList;

public class PiezaExclusiva extends Pieza{
	private double costoExclusividad;

	public PiezaExclusiva(String nombre, String descripcion, double cantPLA, String color, double tiempoImpresion) {
		super(nombre, descripcion, cantPLA, color, tiempoImpresion);
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<Pieza3D> buscar(Condicion cond){
		return new ArrayList<Pieza3D>(); // Devuelve un array vacio porque no debe incluirse en las busquedas
	}

	public double getCostoExclusividad() {
		return costoExclusividad;
	}

	public void setCostoExclusividad(double costoExclusividad) {
		this.costoExclusividad = costoExclusividad;
	}
	
	public double getCosto() {
		return super.getCosto() + costoExclusividad; // El costo de esta pieza es su costo + un costo de exclusividad
	}
	
}
