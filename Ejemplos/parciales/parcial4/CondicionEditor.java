package parcial4;

public class CondicionEditor extends Condicion {
	private String editor;
	
	public CondicionEditor(String editor) {
		this.editor = editor;
	}
	
	public boolean cumple(Articulo art) {
		return art.getEditor().equals(editor);
	}
}
