package ejercicio2;

import java.util.ArrayList;

public class AlarmaSensorial extends Alarma {
	private ArrayList<Sensor> sensores;

	public AlarmaSensorial() {
		super();
		this.sensores = new ArrayList<>();
	}

	public ArrayList<Sensor> getSensores() {
		return sensores;
	}

	public void setSensores(ArrayList<Sensor> sensores) {
		this.sensores = sensores;
	}

	public void agregarSensor(Sensor unSensor) {
		sensores.add(unSensor);
	}

	public void comprobar() {
		for (Sensor sensor : sensores) {
			if (sensor.isVidrioRoto() || sensor.isMovimientoDetectado() || sensor.isPuertaVentanaAbierta()) {
				System.out.println(sensor.getZonaDeControl());
				super.getTimbre().hacerSonar();
				super.getLuz().encender();
				System.out.println("---------------------------------------");
			} else {
				System.out.println(sensor.getZonaDeControl());
				System.out.println("Todo ok");
				System.out.println("---------------------------------------");
			}
		}
	}
}
