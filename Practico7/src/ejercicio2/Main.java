package ejercicio2;

public class Main {

	public static void main(String[] args) {
		
		Documento docu1 = new Documento("Casa y perro","bla bla perro casa perro");
		Documento docu2 = new Documento("Perro y casa","blu blu ble bla");
		Documento docu3 = new Documento("Casa y agua","perro casa casa blu bla");
		Documento docu4 = new Documento("Coco","1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2");
		
		
		docu1.addPalabrasclave("cuco");
		
		docu1.addAutores("carlos");
		docu3.addAutores("carlos");
		
		Historiador historiador = new Historiador();
		
		historiador.addDocumento(docu1);
		historiador.addDocumento(docu2);
		historiador.addDocumento(docu3);
		historiador.addDocumento(docu4);
		
		BuscarTitulo titulo = new BuscarTitulo("Casa y Perro");
		BuscarSubstring substring = new BuscarSubstring("perro");
		BuscarPalabraClave palabraClave = new BuscarPalabraClave("cuco");
		BuscarSinPalabraClave sinPalabraClave = new BuscarSinPalabraClave();
		BuscarAutor autor = new BuscarAutor("carlos");
		BuscarFrase frase = new BuscarFrase("bla");
		BuscarCantPalabras cantPalabras = new BuscarCantPalabras();
		CondicionAnd condAND = new CondicionAnd(frase, autor);
		
		System.out.println("a) Todos los documentos cuyo título sea exactamente igual a un título dado "+historiador.buscar(titulo));
		System.out.println("b) Todos los documentos cuyo título contenga una palabra o frase dada "+historiador.buscar(substring));
		System.out.println("c) Todos los documentos que contengan una palabra clave dada "+historiador.buscar(palabraClave));
		System.out.println("d) Todos los documentos que no contengan ninguna palabra clave "+historiador.buscar(sinPalabraClave));
		System.out.println("e) Todos los documentos de un autor determinado "+historiador.buscar(autor));
		System.out.println("f) Todos los documentos cuyo contenido tenga una palabra o frase dada "+historiador.buscar(frase));
		System.out.println("g) Todos los documentos cuyo contenido tenga al menos 20 palabras "+historiador.buscar(cantPalabras));
		System.out.println("h) Cualquier combinación lógica de las formas anteriores "+historiador.buscar(condAND));
	}

}
