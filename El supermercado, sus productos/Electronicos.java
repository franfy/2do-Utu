public class Electronicos extends Producto {
	
	protected String modelo;
	protected String funcion;
	
	public Electronicos(String nombre, double precio, String id, int stock, String modelo, String funcion) {
		super(nombre, precio, id, stock);
		this.modelo = modelo;
		this.funcion = funcion;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFuncion() {
		return funcion;
	}
	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}
}