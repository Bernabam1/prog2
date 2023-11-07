package parcial3;

import java.util.ArrayList;

public class NoticiaPatrocinada extends Noticia {

	//Una noticia “Patrocinada”, la cual posee un título, un contenido, palabras claves, el autor es “Leira Niresetnom”, y
	//la categoría es “Negociación” (y no puede cambiar).

	public NoticiaPatrocinada(String titulo, String contenido, ArrayList<String> palabrasClave) {
		super(titulo, contenido, "Leira Niresetnom", "Negociación");
		this.setPalabrasClave(palabrasClave);
	}
	
	@Override
    public void setAutor(String autor) {
        System.out.println("No se puede cambiar el autor");
    }

}
