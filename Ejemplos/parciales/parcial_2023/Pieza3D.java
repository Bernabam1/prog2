package parcial_2023;

import java.util.ArrayList;

public abstract class Pieza3D {
	private String nombre;
	private String descripcion;
	private static int precioGramo = 12;
	private static int costoSegundo = 45;
	
	public Pieza3D(String nombre, String descripcion){
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public abstract double getCantPLA();
	public abstract int getCantSimples();
	public abstract double getTiempoImpresion();
	public abstract ArrayList<String> getColores();
	public abstract ArrayList<Pieza3D> buscar(Condicion cond);
	
	public double getCosto() {
		return this.getCantPLA() * precioGramo + this.getTiempoImpresion() * costoSegundo;
	}
}
