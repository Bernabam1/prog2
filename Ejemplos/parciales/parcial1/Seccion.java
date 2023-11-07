package parcial1;

import java.util.ArrayList;

public class Seccion extends Articulo {
	private ArrayList<Articulo> secciones;
	private int determinanteCategoria; // Este puede cambiar asi que no es constante
	private static final String UNDEFINED = "Sin definir";

	public Seccion(int determinanteCategoria) {
		this.determinanteCategoria = determinanteCategoria;
		this.secciones = new ArrayList<>();
	}

	public int getDeterminanteCategoria() {
		return determinanteCategoria;
	}

	public void setDeterminanteCategoria(int determinanteCategoria) {
		this.determinanteCategoria = determinanteCategoria;
	}

	@Override
	public String getCategoria() {
		String categoria = "";
		if (secciones.size() < determinanteCategoria) { // Si el array tiene menos elementos q el indice q la setea
			categoria = UNDEFINED; // La categoria es "Sin definir"
		} else {
			for (int i = 0; i < secciones.size(); i++) {
				if (i == determinanteCategoria) { // Sino, para la posicion que determina la categoria le pido el valor
					categoria = secciones.get(i).getCategoria(); // Que tiene el elemento categoria en esa posicion
				}
			}
		}
		return categoria;
	}

	@Override
	public ArrayList<String> getPalabrasClave() {
		ArrayList<String> resultado = new ArrayList<>();
		for (Articulo seccion : secciones) {
			ArrayList<String> parcial = seccion.getPalabrasClave();
			for (String pp : parcial) {
				if (!resultado.contains(pp)) {
					resultado.add(pp);
				}
			}
		}
		return resultado;
	}

	@Override
	public ArrayList<Articulo> buscar(Condicion cond) {
		ArrayList<Articulo> resultado = new ArrayList<>();
		for (Articulo sec : secciones) { // Separo los objetos de secciones
			resultado.addAll(sec.buscar(cond)); // Acá le digo que busquen la condicion y se agreguen si la cumplen
			// Es addAll porque el buscar le puede llegar tanto a un simple como a un
			// compuesto
		}
		return resultado;
	}
}
