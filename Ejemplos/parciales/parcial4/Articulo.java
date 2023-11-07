package parcial4;

import java.util.ArrayList;

public abstract class Articulo {
	private String titulo;
	private String editor;
	
	public Articulo(String titulo, String editor) {
		this.setTitulo(titulo);
		this.setEditor(editor);
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}
	
	public int getCantElementos() {
		return 1;
	}

	public abstract String getCategoria();
	public abstract ArrayList<String> getPalabrasClave();
	public abstract String getContenido();
	public abstract ArrayList<Articulo> buscar(Condicion cond);
}
