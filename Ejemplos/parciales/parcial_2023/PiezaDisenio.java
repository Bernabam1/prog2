package parcial_2023;

public class PiezaDisenio extends PiezaCompuesta{
	private Condicion cond; // Tiene una condicion para agregarse

	public PiezaDisenio(Condicion cond, String nombre, String descripcion, double extraPLA, double extraTiempo) {
		super(nombre, descripcion, extraPLA, extraTiempo);
		this.cond = cond;
	}
	
	public void addElemento(Pieza3D pieza) { // Sobreescribo la forma que tiene de agregar elementos
		if (cond.cumple(pieza)) {
			super.addElemento(pieza); // Tengo que llamar a que la agregue la superclase con su addElemento
		}
	}
	
}
