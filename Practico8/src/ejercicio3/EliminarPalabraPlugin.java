package ejercicio3;

import java.util.ArrayList;

public class EliminarPalabraPlugin implements Plugin {
	private String palabraParaEliminar;
	private ArrayList<String> palabrasSinEliminar;

	public EliminarPalabraPlugin(String palabraParaEliminar) {
		this.palabraParaEliminar = palabraParaEliminar;
		this.palabrasSinEliminar = new ArrayList<>();
	}
	
	public ArrayList<String> getPalabrasSinEliminar(){
		return new ArrayList<>(palabrasSinEliminar);
	}

	@Override
	public void ejecutar(String texto) {
		String[] palabras = texto.split("\\s+");
		for (String palabra : palabras) {
			if (!palabra.equalsIgnoreCase(palabraParaEliminar)) {
				palabrasSinEliminar.add(palabra);
			}
		}
		System.out.println(palabrasSinEliminar);
	}

}
