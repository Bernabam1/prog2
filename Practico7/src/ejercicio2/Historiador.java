package ejercicio2;

import java.util.ArrayList;

/*

El historiador necesita poder encontrar fácilmente documentos en su
colección de acuerdo a diferentes criterios, por ejemplo:
a) Todos los documentos cuyo título sea exactamente igual a un título dado.
b) Todos los documentos cuyo título contenga una palabra o frase dada.
c) Todos los documentos que contengan una palabra clave dada.
d) Todos los documentos que no contengan ninguna palabra clave.
e) Todos los documentos de un autor determinado.
f) Todos los documentos cuyo contenido tenga una palabra o frase dada.
g) Todos los documentos cuyo contenido tenga al menos 20 palabras.
h) Cualquier combinación lógica de las formas anteriores

*/

public class Historiador {
	private ArrayList<Documento> documentos;

	public Historiador() {
		this.documentos = new ArrayList<>();
	}

	public void addDocumento(Documento docu) {
		if (!documentos.contains(docu)) {
			documentos.add(docu);
		}
	}

	public ArrayList<Documento> getDocumentos() {
		return new ArrayList<>(documentos);
	}

	public ArrayList<Documento> buscar(Condicion unaCondicion) {
		// Metodo para buscar directamente por condicion
		ArrayList<Documento> aux = new ArrayList<>();
		// Guardo espacio para un arraylist que voy a usar de retorno
		for (Documento documento : documentos) {
			// Recorro la lista agroquimicos
			if (unaCondicion.cumple(documento)) {
				// La condicion chequea el metodo cumple en el agroquimico que esta siendo
				// iterado
				aux.add(documento);
				// Si la cumple, agrega el agroquimico a aux
			}
		}
		return aux;
		// Retorno
	}

}
