package ejercicio2;

import java.util.ArrayList;

public class ColaComputadoras extends Cola {
	
	private ArrayList<Computadora> computadoras;

	public ColaComputadoras() {
		this.computadoras = new ArrayList<>();
	}

	public void addComputadora(Computadora unaComputadora) {
		if (computadoras.isEmpty()) {
			computadoras.add(unaComputadora);
		} else {
			for (int i = 0; i < computadoras.size(); i++) {
				if (computadoras.get(i).getVelocidad() < unaComputadora.getVelocidad()) {
					computadoras.add(i, unaComputadora);
				}
			}
		}
	}

	public ArrayList<Computadora> getComputadoras() {
		return new ArrayList<Computadora>(computadoras);
	}
	
	@Override
	public void addCola() {
		
	}

}
