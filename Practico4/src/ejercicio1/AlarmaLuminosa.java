package ejercicio1;

public class AlarmaLuminosa extends Alarma {

	private Luz luz;

	public AlarmaLuminosa() {
		super();
		this.luz = new Luz();
	}
	
	public Luz getLuz() {
		return luz;
	}

	public void setLuz(Luz luz) {
		this.luz = luz;
	}

	public void comprobar() {
		if (this.isVidrioRoto() || this.isMovimientoDetectado() || this.isPuertaVentanaAbierta()) {
			this.getLuz().encender();
			this.getTimbre().hacerSonar();
		} else {
			System.out.println("Todo ok");
		}
	}
}
