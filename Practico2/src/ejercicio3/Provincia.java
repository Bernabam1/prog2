package ejercicio3;

public class Provincia {
	
	private String nombre;
	private Ciudad[] ciudades;

	public Provincia(String nombre, Ciudad[] ciudades) {
		this.nombre = nombre;
		this.ciudades = ciudades;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Ciudad[] getCiudades() {
		return ciudades;
	}

	public void setCiudades(Ciudad[] ciudades) {
		this.ciudades = ciudades;
	}
	
	public boolean masMitadDeficit() {
		int cont = 0;
		for (Ciudad ciudad : ciudades) {
			if (ciudad.estaEnDeficit()) {
				cont++;
			}
		}
		return cont > Math.ceil(ciudades.length / 2);
	}
}
