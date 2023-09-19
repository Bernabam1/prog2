package ejercicio5;

import java.util.ArrayList;

public class Congelado {
	private ArrayList<CongeladoAire> congeladosAire;
	private ArrayList<CongeladoAgua> congeladosAgua;
	private ArrayList<CongeladoNitrogeno> congeladosNitrogeno;

	public Congelado(ArrayList<CongeladoAire> congeladosAire, ArrayList<CongeladoAgua> congeladosAgua,
			ArrayList<CongeladoNitrogeno> congeladosNitrogeno) {
		this.congeladosAire = congeladosAire;
		this.congeladosAgua = congeladosAgua;
		this.congeladosNitrogeno = congeladosNitrogeno;
	}

	public ArrayList<CongeladoAire> getCongeladosAire() {
		return congeladosAire;
	}

	public void setCongeladosAire(ArrayList<CongeladoAire> congeladosAire) {
		this.congeladosAire = congeladosAire;
	}

	public ArrayList<CongeladoAgua> getCongeladosAgua() {
		return congeladosAgua;
	}

	public void setCongeladosAgua(ArrayList<CongeladoAgua> congeladosAgua) {
		this.congeladosAgua = congeladosAgua;
	}

	public ArrayList<CongeladoNitrogeno> getCongeladosNitrogeno() {
		return congeladosNitrogeno;
	}

	public void setCongeladosNitrogeno(ArrayList<CongeladoNitrogeno> congeladosNitrogeno) {
		this.congeladosNitrogeno = congeladosNitrogeno;
	}
	
	public void printDatosCompletos() {
		for (CongeladoAgua congeladoAgua : congeladosAgua) {
			System.out.println("Congelado por Agua");
			congeladoAgua.printDatosCompletos();
		}
		for (CongeladoAire congeladoAire : congeladosAire) {
			System.out.println("Congelado por Aire");
			congeladoAire.printDatosCompletos();
		}
		for (CongeladoNitrogeno congeladoNitrogeno : congeladosNitrogeno) {
			System.out.println("Congelado por Nitrogeno");
			congeladoNitrogeno.printDatosCompletos();
		}
	}
}
