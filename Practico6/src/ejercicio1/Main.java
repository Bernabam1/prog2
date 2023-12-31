package ejercicio1;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {

		Cliente c1 = new Cliente("Cliente 1");
		Cliente c2 = new Cliente("Cliente 2");

		Pelicula p1 = new Pelicula("Terminator", 1);
		Pelicula p2 = new Pelicula("Jurassic Park", 5);
		Pelicula p3 = new Pelicula("Volver al futuro", 2);

		AutoNaftero an1 = new AutoNaftero("Ford", 2000, "ABC-123");
		AutoElectrico ae1 = new AutoElectrico("Tesla", 100, "TES-321");
		AutoDiesel ad1 = new AutoDiesel("Fiat", 3000, "QWE-111");

		Videoclub vc = new Videoclub();

		vc.addCliente(c1);
		vc.addCliente(c2);

		vc.addProducto(p1);
		vc.addProducto(p3);
		vc.addProducto(p2);

		vc.addProducto(an1);
		vc.addProducto(ae1);
		vc.addProducto(ad1);
		
		LocalDate fechaAlq = LocalDate.of(2000, 1, 1);
		
		c1.alquilarAuto(ad1, LocalDate.now());
		c1.alquilarPelicula(p3,LocalDate.now());

		System.out.println(vc.getProductosDisponibles());

		c2.alquilarAuto(ad1,fechaAlq);
		c2.alquilarPelicula(p3,fechaAlq);
		c2.alquilarPelicula(p1,fechaAlq);
		c1.alquilarPelicula(p1,fechaAlq);
		
		System.out.println(vc.getProductosDisponibles());
	}
}
