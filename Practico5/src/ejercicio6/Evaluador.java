package ejercicio6;

public class Evaluador {
	private String nombre;
	private TipoEvaluador tipo;

	public Evaluador(String nombre, TipoEvaluador tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoEvaluador getTipo() {
		return tipo;
	}

	public void setTipo(TipoEvaluador tipo) {
		this.tipo = tipo;
	}

}
