package ejercicio3;

public class Main {

	public static void main(String[] args) {

		ProcesadorTextos p1 = new ProcesadorTextos("1 2 3 4 5 6 7 8 9 0");
		
		p1.ejecutarPlugin(new ContadorPalabrasPlugin());
		p1.ejecutarPlugin(new ContadorOcurrenciasPlugin("5"));
		p1.ejecutarPlugin(new ReemplazoTextoPlugin("3", "Palabra"));
		p1.ejecutarPlugin(new EliminarPalabraPlugin("1"));
		
	}

}
