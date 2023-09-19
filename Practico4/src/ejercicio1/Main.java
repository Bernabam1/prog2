package ejercicio1;

public class Main {

	public static void main(String[] args) {
		
		
		AlarmaLuminosa alu = new AlarmaLuminosa();
		
		System.out.println("TEST Alarma Luminosa");
		
		alu.comprobar();
		
		System.out.println("---------------------------------------");
		
		System.out.println("TEST Alarma Común");
		Alarma a1 = new Alarma();
		
		a1.setMovimientoDetectado(true);
		a1.comprobar();
		
	}

}
