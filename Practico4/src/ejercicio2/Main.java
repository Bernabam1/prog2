package ejercicio2;

public class Main {

	public static void main(String[] args) {

		AlarmaSensorial a1 = new AlarmaSensorial();
		Sensor s1 = new Sensor("Sensor Calle");
		Sensor s2 = new Sensor("Sensor Cocina");
		Sensor s3 = new Sensor("Sensor Dormitorio");

		a1.agregarSensor(s1);
		a1.agregarSensor(s2);
		a1.agregarSensor(s3);

		s1.setMovimientoDetectado(true);
		s2.setPuertaVentanaAbierta(true);

		a1.comprobar();
	}
}