package parcial4;

import java.util.ArrayList;

public class Seccion extends Articulo {
	private ArrayList<Articulo> elementos;

	public Seccion(String titulo, String editor) {
		super(titulo, editor);
		this.elementos = new ArrayList<>();
	}

	public ArrayList<Articulo> getElementos() {
		return new ArrayList<Articulo>(elementos);
	}

	public void addElemento(Articulo elemento) {
		elementos.add(elemento);
	}

	@Override
	public String getCategoria() {
		if (!elementos.isEmpty()) {
			return elementos.get(0).getCategoria();
		} else {
			return null;
		}
	}

	@Override
	public ArrayList<String> getPalabrasClave() {
		ArrayList<String> resultado = new ArrayList<>();
		for (Articulo elem : elementos) {
			ArrayList<String> aux = elem.getPalabrasClave(); // esto es muy importante
			for (String ss : aux) { // porque si no lo hago no estoy buscando adentro del elem
				if (!resultado.contains(ss)) {
					resultado.add(ss);
				}
			}
		}
		return resultado;
	}

	@Override
	public String getContenido() {
		String resultado = null;
		for (Articulo elem : elementos) {
			resultado += elem.getContenido();
		}
		return resultado;
	}

	@Override
	public int getCantElementos() {
		int contador = super.getCantElementos(); //En super devuelve 1
		for(Articulo elem : elementos) {
			contador += elem.getCantElementos();
		}
		return contador;
	}

	@Override
	public ArrayList<Articulo> buscar(Condicion cond) {
		ArrayList<Articulo> resultado = new ArrayList<>();
		for (Articulo elem : elementos) {
			if(cond.cumple(elem)) {
				resultado.addAll(elem.buscar(cond));
			}
		}
		return resultado;
	}
	
	
	
}
