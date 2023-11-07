package parcial3;

import java.util.ArrayList;
import java.util.Collections;

public class Seccion extends Articulo {
	private ArrayList<Articulo> elementos;

	public Seccion(String categoria) {
		super(categoria);
		this.elementos = new ArrayList<>();
	}

	public ArrayList<Articulo> getElementos() {
		return new ArrayList<Articulo>(elementos);
	}

	public void addElemento(Articulo elem) {
		elementos.add(elem);
		Collections.sort(elementos, new ComparatorCategoria()); // Consultar esto
	}
	
	@Override
	public ArrayList<String> getPalabrasClave() {
		ArrayList<String> resultado = new ArrayList<>();
		for (Articulo elem : elementos) {
			ArrayList<String> aux = elem.getPalabrasClave();
			for (String ss : aux) {
				if (!resultado.contains(ss)) {
					resultado.add(ss);
				}
			}
		}
		return resultado;
	}

	public Seccion crearCopiaBasica() {
		return new Seccion(this.getCategoria()); // Instancio una copia basica
	}
	
	@Override
	public Seccion getCopia(Condicion cond) {
		Seccion copiaSeccion = crearCopiaBasica(); // Creo una variable con una copia llamando a la fcn q la crea
		for (Articulo hijo : elementos) { // Recorro los elementos de la original
			Articulo copiaHijo = hijo.getCopia(cond); // Copiando los que cumplen la condicion
			if (copiaHijo != null) { // Si se cumplio cond va a ser !=null
				copiaSeccion.addElemento(copiaHijo); // Lo agrego entonces a la copia
			}
		}
		if (copiaSeccion.getElementos().size() == 0) { // Cuando termine de copiar (salgo del for) chequeo los elementos
			return null; // Si no hay retorno null
		} else {
			return copiaSeccion; // Sino retorno la copia con el array cargado
		}
	}

	@Override
	public ArrayList<Articulo> buscar(Condicion cond) {
		ArrayList<Articulo> resultado = new ArrayList<>();
		for(Articulo elem : elementos) {
			resultado.addAll(elem.getCopia(cond)); // Como resuelvo esto?
		}
	}

	
}
