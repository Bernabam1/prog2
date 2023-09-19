package ejercicio3;

public class Pais {
	private String nombre;
	private Provincia[] provincias;
	
	public Pais(String nombre, Provincia[] provincias) {
		this.nombre = nombre;
		this.provincias = provincias;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Provincia[] getProvincias() {
		return provincias;
	}
	public void setProvincias(Provincia[] provincias) {
		this.provincias = provincias;
	}
	
	public void ciudadesEnDeficit() {
		for (Provincia provincia : provincias) {
			for (Ciudad ciudad : provincia.getCiudades()) {
				if(ciudad.estaEnDeficit() && ciudad.getHabitantes()>100000) {
					System.out.println(ciudad.getNombre()+" esta en deficit \n");
				}
			}
		}
	}
	
	public void provinciasMitadCiudadesDeficit() {
		for (Provincia provincia : provincias) {
			if (provincia.masMitadDeficit()) {
				System.out.println(provincia.getNombre()+" tiene mas de la mitad de las C en deficit \n");
			}
		}
	}
}
