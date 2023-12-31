package ejercicio4;

public class Main {
	public static void main(String[] args) {

		Ciudad springfield = new Ciudad("Springfield");

		ContribuyenteSimple cs = new ContribuyenteSimple("Jorge", 1, 100);
		ContribuyenteComerciante cc = new ContribuyenteComerciante("Juan", 2, 100, 500);
		ContribuyenteProgramador cp = new ContribuyenteProgramador("Claudio", 3, 100, 1000);

		springfield.addContribuyente(cs);
		springfield.addContribuyente(cc);
		springfield.addContribuyente(cp);

		System.out.println("Total impuesto simple = " + cs.getImpuesto());
		System.out.println("Total impuesto comerciante = " + cc.getImpuesto());
		System.out.println("Total impuesto programador = " + cp.getImpuesto());

		System.out.println("Total recaudado = " + springfield.getTotalRecaudado());
		
		// Como hago si el monto fijo de impuesto lo quiere setear la ciudad??
	}
}
