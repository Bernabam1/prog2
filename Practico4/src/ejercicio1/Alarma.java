package ejercicio1;

public class Alarma {
	private boolean vidrioRoto;
	private boolean puertaVentanaAbierta;
	private boolean movimientoDetectado;
	private Timbre timbre;

	public Alarma() {
		this.vidrioRoto = false;
		this.puertaVentanaAbierta = false;
		this.movimientoDetectado = false;
		this.timbre = new Timbre();
	}

	public boolean isVidrioRoto() {
		return vidrioRoto;
	}

	public void setVidrioRoto(boolean vidrioRoto) {
		this.vidrioRoto = vidrioRoto;
	}

	public boolean isPuertaVentanaAbierta() {
		return puertaVentanaAbierta;
	}

	public void setPuertaVentanaAbierta(boolean puertaVentanaAbierta) {
		this.puertaVentanaAbierta = puertaVentanaAbierta;
	}

	public boolean isMovimientoDetectado() {
		return movimientoDetectado;
	}

	public void setMovimientoDetectado(boolean movimientoDetectado) {
		this.movimientoDetectado = movimientoDetectado;
	}

	public Timbre getTimbre() {
		return timbre;
	}

	public void setTimbre(Timbre timbre) {
		this.timbre = timbre;
	}

	public void comprobar() {
		if (this.isVidrioRoto() || this.isMovimientoDetectado() || this.isPuertaVentanaAbierta()) {
			timbre.hacerSonar();
		}
		else {
			System.out.println("Todo ok");
		}
	}
}
