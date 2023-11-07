package parcial_2023;

import java.util.ArrayList;

public class Pieza extends Pieza3D{
	public double cantPLA; // Estos atributos no van en el abstracto porque son propios del simple cuando se instancia
	public String color; // En el Compuesto, estos atributos no van porque se calculan
	public double tiempoImpresion;
	
	public Pieza(String nombre, String descripcion, double cantPLA, String color, double tiempoImpresion) {
		super(nombre, descripcion);
		this.cantPLA = cantPLA;
		this.color = color;
		this.tiempoImpresion = tiempoImpresion;
	}
	
	@Override
	public double getCantPLA() {
		return cantPLA;
	}

	public void setCantPLA(double cantPLA) {
		this.cantPLA = cantPLA;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getTiempoImpresion() {
		return tiempoImpresion;
	}

	public void setTiempoImpresion(double tiempoImpresion) {
		this.tiempoImpresion = tiempoImpresion;
	}

	@Override
	public int getCantSimples() {
		return 1;
	}

	@Override
	public ArrayList<String> getColores() {
		ArrayList<String> aux = new ArrayList<>();
		aux.add(color);
		
		return aux;
	}
	
	@Override
	public ArrayList<Pieza3D> buscar(Condicion cond) {
		ArrayList<Pieza3D> aux = new ArrayList<>();
		if (cond.cumple(this)) {
			aux.add(this);
		}
		return aux;
	}
	
}
