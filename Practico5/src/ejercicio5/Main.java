package ejercicio5;

public class Main {
	public static void main(String[] args) {
		Empresa e1 = new Empresa();
		
		Vendedor martin = new Vendedor("Martín", "Gómez" , 30111333, 15000);
		Vendedor pablo = new Vendedor ("Pablo","Pérez", 20555666, 13000);
		
		martin.setMontoVentas(10000);
		pablo.setMontoVentas(10000);
		martin.setPorcentajePorVenta(5);
		pablo.setPorcentajePorVenta(10);
		
		System.out.println("Martín cobra: $"+martin.cobrarSueldo());
		System.out.println("Pablo cobra: $"+pablo.cobrarSueldo());
			
		EmpleadoBono julian = new EmpleadoBono("Julián", "Rodriguez" , 40222555, 15000);
		EmpleadoBono mauro = new EmpleadoBono("Mauro", "García" , 20888999, 15000);
		EmpleadoBono carlos = new EmpleadoBono("Carlos", "Méndez", 11999888,15000);
		
		julian.setCantVentas(50);
		mauro.setCantVentas(100);
		
		System.out.println("Julián cobra: $"+julian.cobrarSueldo());
		System.out.println("Mauro cobra: $"+mauro.cobrarSueldo());
		System.out.println("Carlos cobra: $"+carlos.cobrarSueldo());
		
		e1.addEmpleado(pablo);
		e1.addEmpleado(martin);
		e1.addEmpleado(carlos);
		e1.addEmpleado(mauro);
		e1.addEmpleado(julian);
		
		System.out.println("Gasto en sueldos de la empresa = $"+e1.gastoEnSueldos());
	}
}
