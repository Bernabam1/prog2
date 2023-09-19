package ejercicio1;

import java.util.Stack;

public class Pila {

	public static void main(String[] args) {

		Elemento e1 = new Elemento("Elemento 1");
		Elemento e2 = new Elemento("Elemento 2");
		Elemento e3 = new Elemento("Elemento 3");
		Elemento e4 = new Elemento("Elemento 4");
		Elemento e5 = new Elemento("Elemento 5");

		Stack<Elemento> pila = new Stack<Elemento>();

		// Agrega a la pila
		pila.push(e1);
		pila.push(e2);
		pila.push(e3);
		pila.push(e4);
		pila.push(e5);
		mostrarElementos(pila);
		
		// Miro el ultimo
		System.out.println("Nombre del ultimo elemento: "+pila.peek().getNombre());
		System.out.println("----------------");
		
		// Elimina el ultimo
		pila.pop();
		pila.pop();
		mostrarElementos(pila);
		
		// Tamaño
		System.out.println("Tamaño del stack: "+pila.size());
		
		// Retornar una nueva pila con una copia de los elementos de la pila original, en
		// el mismo orden. La pila original debe mantener el orden de los elementos
		
		// pila.copy(); ?????
		
		// Reverse
		
		// pila.reverse(); ????
	}

	public static void mostrarElementos(Stack<Elemento> stack) {
		for (Elemento elemento : stack) {
			System.out.println(elemento.getNombre());	
		}
		System.out.println("----------------");
	}

}
