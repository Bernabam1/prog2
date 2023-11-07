package parcial3;

import java.util.ArrayList;

public class NuevaSeccion extends Seccion {
	private String nombre;
	private ArrayList<String> categoriasAdmisibles;

	public NuevaSeccion(String nombre, String categoria, Condicion cond) {
		super(categoria);
		this.setNombre(nombre);
		this.categoriasAdmisibles = new ArrayList<>();
		// No es necesario incializar nuevamente el ArrayList de elementos
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addCategoriaAdmisible(String categoria) {
		categoriasAdmisibles.add(categoria);
	}
	
	public void addElemento(Articulo elem) {
		for (String categoria : categoriasAdmisibles) { // Recorro las categorias admisibles
			if(elem.getCategoria().equals(categoria)){ // Me fijo si alguna es igual a las del elemento
				super.addElemento(elem); // Si es asi lo agrego
			}
		}
	}
}
