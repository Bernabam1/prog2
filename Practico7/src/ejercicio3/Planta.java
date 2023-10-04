package ejercicio3;

import java.util.ArrayList;

public class Planta {
	private String nombreCientifico;
	private ArrayList<String> nombresVulgares;
	private String clasificacion;
	private String familia;
	private String clase;
	private int reqSol;
	private int reqAgua;

	public Planta(String nombreCientifico, ArrayList<String> nombresVulgares, String clasificacion, String familia,
			String clase, int reqSol, int reqAgua) {
		this.nombreCientifico = nombreCientifico;
		this.nombresVulgares = nombresVulgares;
		this.clasificacion = clasificacion;
		this.familia = familia;
		this.clase = clase;
		this.reqSol = reqSol;
		this.reqAgua = reqAgua;
	}

	public String getNombreCientifico() {
		return nombreCientifico;
	}

	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}

	public ArrayList<String> getNombresVulgares() {
		return nombresVulgares;
	}

	public void setNombresVulgares(ArrayList<String> nombresVulgares) {
		this.nombresVulgares = nombresVulgares;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public int getReqSol() {
		return reqSol;
	}

	public void setReqSol(int reqSol) {
		this.reqSol = reqSol;
	}

	public int getReqAgua() {
		return reqAgua;
	}

	public void setReqAgua(int reqAgua) {
		this.reqAgua = reqAgua;
	}

	@Override
	public String toString() {
		return "Planta [nombreCientifico=" + nombreCientifico + ", clase=" + clase + "]";
	}

}
