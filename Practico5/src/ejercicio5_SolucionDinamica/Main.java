package ejercicio5_SolucionDinamica;

public class Main {
	public static void main(String[] args) {
		Empresa e1 = new Empresa();

		Empleado martin = new Empleado("Martín", "Gómez", 30111333);
		Empleado pablo = new Empleado("Pablo", "Pérez", 20555666);

		ComisionPorVenta cv1 = new ComisionPorVenta();
		cv1.setSueldoBase(15000);
		cv1.setMontoVentas(10000);
		cv1.setPorcentajePorVenta(5);

		martin.setFp(cv1);

		ComisionPorVenta cv2 = new ComisionPorVenta();
		cv2.setSueldoBase(13000);
		cv2.setMontoVentas(10000);
		cv2.setPorcentajePorVenta(10);

		pablo.setFp(cv2);

		System.out.println("Martín cobra: $" + martin.cobrarSueldo());
		System.out.println("Pablo cobra: $" + pablo.cobrarSueldo());

		Empleado julian = new Empleado("Julián", "Rodriguez", 40222555);
		Empleado mauro = new Empleado("Mauro", "García", 20888999);
		Empleado carlos = new Empleado("Carlos", "Méndez", 11999888);

		Bono b1 = new Bono();
		b1.setSueldoBase(15000);
		b1.setCantVentas(50);

		julian.setFp(b1);
		
		Bono b2 = new Bono();
		b2.setSueldoBase(15000);
		b2.setCantVentas(100);

		mauro.setFp(b2);
		
		Bono b3 = new Bono();
		b3.setSueldoBase(15000);
		b3.setCantVentas(0);

		carlos.setFp(b3);

		System.out.println("Julián cobra: $" + julian.cobrarSueldo());
		System.out.println("Mauro cobra: $" + mauro.cobrarSueldo());
		System.out.println("Carlos cobra: $" + carlos.cobrarSueldo());

		e1.addEmpleado(pablo);
		e1.addEmpleado(martin);
		e1.addEmpleado(carlos);
		e1.addEmpleado(mauro);
		e1.addEmpleado(julian);

		System.out.println("Gasto en sueldos de la empresa = $" + e1.gastoEnSueldos());
		
		//Como paso sueldo base? en donde va? lo metí en forma de pago pero lo veo raro
	}
}
