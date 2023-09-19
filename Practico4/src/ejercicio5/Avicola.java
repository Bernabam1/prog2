package ejercicio5;

import java.time.LocalDate;
import java.util.ArrayList;

public class Avicola {
	public static void main(String[] args) {

		LocalDate vencimiento = LocalDate.of(2024, 1, 1);
		LocalDate envasado = LocalDate.of(2023, 10, 10);

		ArrayList<Producto> frescos = new ArrayList<>();

		Producto fresco1 = new Producto(vencimiento, envasado, 1, "Granja 1");
		Producto fresco2 = new Producto(vencimiento, envasado, 2, "Granja 2");
		Producto fresco3 = new Producto(vencimiento, envasado, 3, "Granja 3");

		frescos.add(fresco1);
		frescos.add(fresco2);
		frescos.add(fresco3);

		ArrayList<CongeladoAire> congeladosAire = new ArrayList<>();

		CongeladoAire aire1 = new CongeladoAire(vencimiento, envasado, 4, "Granja 1A", -1, 5.0, 4.0, 3.0, 2.0);
		CongeladoAire aire2 = new CongeladoAire(vencimiento, envasado, 5, "Granja 2A", -2, 6.0, 5.0, 4.0, 3.0);
		CongeladoAire aire3 = new CongeladoAire(vencimiento, envasado, 6, "Granja 3A", -3, 7.0, 6.0, 5.0, 4.0);

		congeladosAire.add(aire1);
		congeladosAire.add(aire2);
		congeladosAire.add(aire3);

		ArrayList<CongeladoAgua> congeladosAgua = new ArrayList<>();

		CongeladoAgua agua1 = new CongeladoAgua(vencimiento, envasado, 7, "Granja 1C", -4, 10);
		CongeladoAgua agua2 = new CongeladoAgua(vencimiento, envasado, 8, "Granja 2C", -5, 15);
		CongeladoAgua agua3 = new CongeladoAgua(vencimiento, envasado, 9, "Granja 3C", -6, 20);

		congeladosAgua.add(agua1);
		congeladosAgua.add(agua2);
		congeladosAgua.add(agua3);

		ArrayList<CongeladoNitrogeno> congeladosNitrogeno = new ArrayList<>();

		CongeladoNitrogeno nitro1 = new CongeladoNitrogeno(vencimiento, envasado, 10, "Granja 1N", -7, "Met1", 10.0);
		CongeladoNitrogeno nitro2 = new CongeladoNitrogeno(vencimiento, envasado, 11, "Granja 2N", -8, "Met2", 10.0);
		CongeladoNitrogeno nitro3 = new CongeladoNitrogeno(vencimiento, envasado, 12, "Granja 3N", -9, "Met3", 10.0);

		congeladosNitrogeno.add(nitro1);
		congeladosNitrogeno.add(nitro2);
		congeladosNitrogeno.add(nitro3);

		Congelado prodCongelados = new Congelado(congeladosAire, congeladosAgua, congeladosNitrogeno);

		prodCongelados.printDatosCompletos();
		// por que no respeta siempre el orden en el print??
		// por que imprime 2 lineas al final de nitro 3??
	}
}
