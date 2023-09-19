
public class Rectangulo {
	
	// Atributos
	
	private PuntoGeometrico verticeSuperiorIzq;
	private PuntoGeometrico verticeSuperiorDer;
	private PuntoGeometrico verticeInferiorIzq;	
	private PuntoGeometrico verticeInferiorDer;
	
	// Constructores
	
	public Rectangulo() {		
	}
	
	public Rectangulo(PuntoGeometrico verticeSuperiorIzq, PuntoGeometrico verticeSuperiorDer, PuntoGeometrico verticeInferiorIzq, PuntoGeometrico verticeInferiorDer) {
		this.verticeSuperiorIzq = verticeSuperiorIzq;
		this.verticeSuperiorDer = verticeSuperiorDer;
		this.verticeInferiorIzq = verticeInferiorIzq;
		this.verticeInferiorDer = verticeInferiorDer;
	}

	// Métodos
	
	public void desplazarRectangulo(double cantidadX, double cantidadY) {
		this.verticeSuperiorIzq.desplazarPG(cantidadX, cantidadY);
		this.verticeSuperiorDer.desplazarPG(cantidadX, cantidadY);
		this.verticeInferiorIzq.desplazarPG(cantidadX, cantidadY);
		this.verticeInferiorDer.desplazarPG(cantidadX, cantidadY);
	}
	
	public double calcularArea() {
		double base = Math.abs(this.verticeInferiorIzq.getX()-this.verticeSuperiorDer.getX());
		double altura = Math.abs(this.verticeInferiorIzq.getY()-this.verticeSuperiorIzq.getY());
		
		return base * altura;
	}
	
	public void compararRectangulo(Rectangulo OtroRectangulo) {
		
		 double areaActual = this.calcularArea();
		 double areaOtro = OtroRectangulo.calcularArea();

		    if (areaActual > areaOtro) {
		        System.out.println("1: Rectangulo es mayor que OtroRectangulo");
		    } else if (areaActual == areaOtro) {
		        System.out.println("0: Rectangulo es igual que OtroRectangulo");
		    } else {
		        System.out.println("-1: Rectangulo es menor que OtroRectangulo");
		    }
	}
	
	public boolean esCuadrado() {
		double base = largoLadoSuperior();
		double altura = Math.abs(this.verticeInferiorIzq.getY()-this.verticeSuperiorIzq.getY());
		
		return base == altura;
	}
	
	public double largoLadoSuperior() {
		double largo = Math.abs(this.verticeSuperiorIzq.getX()-this.verticeSuperiorDer.getX());
		return largo;
	}
	
	public boolean estaAcostado() {
		double ancho = this.largoLadoSuperior();
		double alto = Math.abs(this.verticeInferiorIzq.getY()-this.verticeSuperiorIzq.getY());
		
		return ancho>alto;
	}
	
	//-----------------------------------------------------------------------------------------
	// Main
	//-----------------------------------------------------------------------------------------
	
	public static void main (String[] args) {
		
		PuntoGeometrico a = new PuntoGeometrico(0,3);
		PuntoGeometrico b = new PuntoGeometrico(6,3);
		PuntoGeometrico c = new PuntoGeometrico(0,0);
		PuntoGeometrico d = new PuntoGeometrico(6,0);
		
		PuntoGeometrico e = new PuntoGeometrico(0,4);
		PuntoGeometrico f = new PuntoGeometrico(7,4);
		PuntoGeometrico g = new PuntoGeometrico(0,0);
		PuntoGeometrico h = new PuntoGeometrico(7,0);
		
		/* a------------b
		 * |            |
		 * |            |
		 * c------------d*/
		
		/* e------------f
		 * |            |
		 * |            |
		 * g------------h*/
		
		Rectangulo r1 = new Rectangulo(a,b,c,d);
		Rectangulo r2 = new Rectangulo(e,f,g,h);
		
		System.out.println("Area r1 = " + r1.calcularArea());
		System.out.println("Area r2 = " + r2.calcularArea());
		
		r1.compararRectangulo(r2);
		
		System.out.println("Es cuadrado? = " +r1.esCuadrado());
		
		System.out.println("Largo superior R1 = " +r1.largoLadoSuperior());
		System.out.println("Largo superior R2 = " +r2.largoLadoSuperior());
		
		System.out.println("Está acostado? = " +r2.estaAcostado());
		
		
	
	}
}
