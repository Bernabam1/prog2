package ejercicio2;

import java.util.ArrayList;

public class ColaProcesos extends Cola {
	private ArrayList<Proceso> procesos;

	public ColaProcesos() {
		this.procesos = new ArrayList<>();
	}

	public void addProceso(Proceso unProceso) {
		if (procesos.isEmpty()) {
			procesos.add(unProceso);
		} else {
			for (int i = 0; i < procesos.size(); i++) {
				if (procesos.get(i).getReqMemoria() < unProceso.getReqMemoria()) {
					procesos.add(i, unProceso);
				}
			}
		}
	}

	public ArrayList<Proceso> getProcesos() {
		return new ArrayList<Proceso>(procesos);
	}
	
	@Override
	public void addCola() {
		
	}

}
