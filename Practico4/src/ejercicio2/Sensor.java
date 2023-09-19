package ejercicio2;

public class Sensor{
	private String zonaDeControl;
	private boolean vidrioRoto;
	private boolean puertaVentanaAbierta;
	private boolean movimientoDetectado;
	

	public Sensor(String zonaDeControl) {
		super();
		this.zonaDeControl = zonaDeControl;
	}


	public String getZonaDeControl() {
		return zonaDeControl;
	}


	public void setZonaDeControl(String zonaDeControl) {
		this.zonaDeControl = zonaDeControl;
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
	
	public boolean pasarSensor() {
		return false;
	}
}

