package ejercicio3;

import java.util.ArrayList;

public class Vivero {
	private ArrayList<Planta> plantas;
	
	public Vivero() {
		this.plantas = new ArrayList<>();
	}
	
	public void addPlanta(Planta unaPlanta) {
		plantas.add(unaPlanta);
	} 
	
	public ArrayList<Planta> getPlantas(){
		return new ArrayList<>(plantas);
	}
	
	public ArrayList<Planta> buscar(Condicion unaCondicion){
		ArrayList <Planta> aux = new ArrayList<>();
		
		for (Planta planta : plantas) {
			if (unaCondicion.cumple(planta)) {
				aux.add(planta);
			}
		}
		return aux;
	}
	
}
