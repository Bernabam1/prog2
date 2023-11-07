package parcial_2023;

import java.util.ArrayList;

public class PiezaCompuesta extends Pieza3D{
	private ArrayList<Pieza3D> elementos;
	private double extraPLA;
	private double extraTiempo;

	public PiezaCompuesta(String nombre, String descripcion, double extraPLA, double extraTiempo) {
		super(nombre, descripcion);
		this.extraPLA = extraPLA;
		this.setExtraTiempo(extraTiempo);
		this.elementos = new ArrayList<>();
	}
	
	public double getExtraPLA() {
		return extraPLA;
	}

	public void setExtraPLA(double extraPLA) {
		this.extraPLA = extraPLA;
	}

	public double getExtraTiempo() {
		return extraTiempo;
	}

	public void setExtraTiempo(double extraTiempo) {
		this.extraTiempo = extraTiempo;
	}

	public void addElemento(Pieza3D pieza) {
		elementos.add(pieza);
	}
	
	public ArrayList<Pieza3D> getElementos() {
		return new ArrayList<Pieza3D>(elementos);
	}
	
	@Override
	public double getCantPLA() { // Suma del PLA necesario + 1 por cada Simple
		double suma = 0.0;
		for(Pieza3D elem : elementos) {
			suma += elem.getCantPLA();
		}	
		return suma + extraPLA * this.getCantSimples();
	}

	@Override
	public int getCantSimples() {
		int suma = 0;
		for (Pieza3D elem : elementos) {
			elem.getCantSimples();
		}
		return suma;
	}

	@Override
	public double getTiempoImpresion() {
		double suma = 0;
		for(Pieza3D elem : elementos) {
			suma += elem.getTiempoImpresion();
		}
		return  suma + extraTiempo;
	}

	@Override
	public ArrayList<String> getColores() {
		ArrayList<String> resultado = new ArrayList<>(); // ArrayList donde voy a acumular los resultados parciales
		for(Pieza3D elem : elementos) { // Recorro la lista que tiene este objeto
			ArrayList<String> aux = elem.getColores(); // Inicio un nuevo ArrayList en el que cargo lo que me devuelve cada elemento
			for(String string : aux) { // Ahora si puedo acceder y chequear individualmente cada String
				if(!resultado.contains(string)) {
					resultado.add(string);
				}
			}
		}
		return resultado;
	}

	@Override
	public ArrayList<Pieza3D> buscar(Condicion cond) {
		ArrayList<Pieza3D> resultado = new ArrayList<>();
		for (Pieza3D elem : elementos) {
			resultado.addAll(elem.buscar(cond)); // Agrego a resultado todos los elementos que cumplan con la condicion;
		}
		return resultado;
	}
	
}
